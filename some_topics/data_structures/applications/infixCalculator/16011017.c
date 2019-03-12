#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_SIZE 100
#define TRUE 1
#define FALSE 0

typedef struct {
	int items[MAX_SIZE];
	char* stackName;
	int top;
}STACK;

//stack-functions
void push(STACK* stack, int data);
int pop(STACK* stack);
int isEmpty(STACK* stack);
int isFull(STACK* stack);
int peek(STACK* stack);
void clearStack(STACK* stack);
void printStack(STACK* stack);


//other-functions
int evaluate(struct STACK* operatorStack, struct STACK* operandStack, const char* expression);
int isDelimiter(const char c);
int isOperand(const char c);
int isOperator(const char c);
int calculate(const char sign, const int operand2, const int operand1);
int getOperatorPrecedence(const char sign);
char* getExpressionFromUser();
int isOpenBracket(const char c);
int isClosedBracket(const char c);


int main() {

	STACK operandStack;
	clearStack(&operandStack);
	operandStack.stackName = "OperandStack";

	STACK operatorStack;
	clearStack(&operatorStack);
	operatorStack.stackName = "OperatorStack";

	printf("\nThe result of your infix expression is: %d.\n", evaluate(&operatorStack, &operandStack, getExpressionFromUser()));

}

void clearStack(STACK* stack) {
	stack->top = -1;
}

void push(STACK* stack, int data) {
	if (isFull(stack)) {
		printf("Stack overflow!\n");
		return;
	}
	stack->items[++stack->top] = data;
}

int pop(STACK* stack) {
	if (isEmpty(stack)) {
		printf("Stack underflow!\n");
		return;
	}
	return stack->items[stack->top--];
}

int isEmpty(STACK* stack) {
	if (stack->top == -1)
		return TRUE;
	else
		return FALSE;
}

int isFull(STACK * stack) {
	if (stack->top == MAX_SIZE - 1)
		return TRUE;
	else
		return FALSE;
}

int peek(STACK * stack) {
	return stack->items[stack->top];
}

void printStack(STACK* stack) {

	if (!strcmp(stack->stackName, "OperandStack")) {
		fprintf(stderr, "OperandStack: top-> ");
		if (isEmpty(stack)) {
			printf("Empty!\n");
		}
		else {
			for(int i=0; i<=stack->top; i++) {
				printf("%d ", stack->items[i]);
			}
			printf("\n");
		}
	}
	//for OperatorStack
	else {
		printf("OperatorStack: top-> ");
		if (isEmpty(stack)) {
			printf("Empty!\n");
		}
		else {
			for (int i = 0; i <= stack->top; i++) {
				printf("%c ", stack->items[i]);
			}
			printf("\n");
		}

	}
}

char* getExpressionFromUser() {

	//if the user does not give any input
	char* temp;
	do {
		printf("Enter an infix expression: ");
		temp = (char*)malloc(sizeof(char) * MAX_SIZE);
		fgets(temp, MAX_SIZE, stdin);
	} while (!strcmp(temp, "\n"));

	//remove the newline chracter 
	if ((strlen(temp) > 0) && (temp[strlen(temp) - 1] == '\n')) {
		temp[strlen(temp) - 1] = '\0';
	}

	//let's dispose of unused space
	char* expression = (char*)malloc(sizeof(char) * (strlen(temp) + 1));
	int i = 0;
	while (temp[i] != '\0') {
		expression[i] = temp[i];
		i++;
	}

	expression[i] = '\0';

	return expression;
}

int evaluate(struct STACK* operatorStack, struct STACK* operandStack, const char* expression) {


	for (int i = 0; i < strlen(expression); i++) {

		if (isDelimiter(expression[i])) {
			continue;
		}
		else if (isOpenBracket(expression[i])) {
			push(operatorStack, expression[i]);
		}
		else if (isClosedBracket(expression[i])) {

			while (!isOpenBracket(peek(operatorStack))) {
				int operand1 = pop(operandStack);
				int operand2 = pop(operandStack);

				int result = calculate(pop(operatorStack), operand2, operand1);
				push(operandStack, result);

				printf("\n");
				printStack(operandStack);
				printStack(operatorStack);
			}
			//remove '(' from the stack
			pop(operatorStack);
		}
		else if (isOperator(expression[i])) {
			while (!isEmpty(operatorStack) && getOperatorPrecedence(peek(operatorStack)) >= getOperatorPrecedence(expression[i])) {

				int operand1 = pop(operandStack);
				int operand2 = pop(operandStack);
				int result = calculate(pop(operatorStack), operand2, operand1);
				push(operandStack, result);
			}
			push(operatorStack, expression[i]);
		}
		else {
			//if it is a number
			int operand = 0;
			while (i < strlen(expression) && isOperand(expression[i])) {
				operand = operand * 10 + expression[i] - '0';
				i++;
			}

			i--;
			push(operandStack, operand);
		}	

		printf("\n");
		printStack(operandStack);
		printStack(operatorStack);
		
	}

	//for remainder operations
	while (!isEmpty(operatorStack)) {
		int operand1 = pop(operandStack);
		int operand2 = pop(operandStack);
		int result = calculate(pop(operatorStack), operand2, operand1);
		push(operandStack, result);
	}
	return peek(operandStack);

}

int getOperatorPrecedence(const char sign)
{
	switch (sign)
	{
	case '(':
		return 1;
	case '+':
	case '-':
		return 2;

	case '*':
	case '/':
		return 3;

	}

	//if the stack is empty
	return 0;
}

int calculate(const char sign, const int operand2, const int operand1) {
	if (sign == '+') {
		return operand2 + operand1;
	}
	else if (sign == '*') {
		return operand2 * operand1;
	}
	else if (sign == '/') {
		if (operand1 > 0) {
			return operand2 / operand1;
		}
		return 0;
	}
	else if (sign == '-') {
		return operand2 - operand1;
	}
	else {
		printf("The expression could not be calculated!");
		exit(0);
		return -1;
	}
}

int isDelimiter(const char c) {
	if (c == ' ')
		return TRUE;
	return FALSE;
}

int isOperand(const char c) {
	if (c >= '0' && c <= '9')
		return TRUE;
	return FALSE;
}

int isOperator(const char c) {
	if (c == '+' || c == '-' || c == '*' || c == '/')
		return TRUE;
	return FALSE;

}

int isOpenBracket(const char c) {
	if (c == '{' || c == '[' || c == '(')
		return TRUE;
	else
		return FALSE;
}

int isClosedBracket(const char c) {
	if (c == '}' || c == ']' || c == ')')
		return TRUE;
	else
		return FALSE;
}

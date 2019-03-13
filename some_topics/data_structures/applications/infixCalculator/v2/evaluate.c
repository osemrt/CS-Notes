#include "functions.h"

int evaluate(struct STACK* operatorStack, struct STACK* operandStack, const char* expression) {

	int i = 0;
	char dummy[MAX_SIZE];

	while (expression[i] != '\0') {

		if (isDelimiter(expression[i])) {
			i++;
			continue;
		}
		else if (isOpenBracket(expression[i])) {
			check(push(operatorStack, expression[i]));
		}
		/*
		else if (expression[i] == ')') {
			
			while (peek(&operatorStack) != '(') {
				int operand1 = pop(&operandStack);
				int operand2 = pop(&operandStack);
				
				int result = calculate(pop(&operatorStack), operand2, operand1);
				push(&operandStack, result);
			}
			//remove '(' from the stack
			pop(&operatorStack);
		}
		
		
		*/
		else if (isClosedBracket(expression[i])) {

			peek(operatorStack, dummy);
			while (!isOpenBracket(dummy[0])) {
				int operand2, operand1;
				char sign;
				check(pop(operatorStack, &sign));
				check(pop(operandStack, &operand2));
				check(pop(operandStack, &operand1));					
				check(push(operandStack, calculate(sign, operand1, operand2)));
				peek(operatorStack, dummy);
			}

			pop(operatorStack, dummy);

			//do{
			//	int operand2, operand1;
			//	char sign;
			//	check(peek(operatorStack, &sign));

			//	//I have to check it because of that I used do-while. (case#open-bracket)
			//	if (!isOpenBracket(sign)) {
			//		check(pop(operandStack, &operand2));
			//		check(pop(operandStack, &operand1));					
			//		check(push(operandStack, calculate(sign, operand1, operand2)));
			//	}		

			//	peek(operatorStack, dummy);
			//}while ((!isEmpty(operatorStack)) && (!isOpenBracket(dummy)));
			////let's remove the closed bracket from operatorStack
			////check(pop(operatorStack, &dummy));
		}
		else if (isOperand(expression[i])) {
			int operand = 0;
			while ((i <= strlen(expression)) && isOperand(expression[i])) {
				operand = expression[i] + operand * 10 - '0';
				i++;
			}
			i--;
			check(push(operandStack, operand));
		}
		else {
			//if it's operator

			/*while (!isEmpty(&operatorStack) && (getOperatorPrecedence(peek(&operatorStack)) >= getOperatorPrecedence(expression[i]))) {

				int operand1 = pop(&operandStack);
				int operand2 = pop(&operandStack);
				int result = calculate(pop(&operatorStack), operand2, operand1);
				push(&operandStack, result);
			}
			push(&operatorStack, expression[i]);*/

			peek(operatorStack, dummy);
			while (!isEmpty(&operatorStack) && (getOperatorPrecedence(dummy) >= getOperatorPrecedence(expression[i]))) {
				int operand2, operand1;
				char sign;

				check(pop(operatorStack, &sign));
				check(pop(operandStack, &operand2));
				check(pop(operandStack, &operand1));
				check(push(operandStack, calculate(sign, operand1, operand2)));
			}

			push(operatorStack, expression[i]);


			//peek(operatorStack, dummy);
			//while (isEmpty(operatorStack) && (getOperatorPrecedence(dummy) >= getOperatorPrecedence(expression[i]))) {
			//	int operand2, operand1;
			//	char sign;

			//	check(pop(operandStack, &operand2));
			//	check(pop(operandStack, &operand1));
			//	check(pop(operatorStack, &sign));
			//	check(push(operandStack, calculate(sign, operand1, operand2)));

			//	//for while condition
			//	check(peek(operatorStack, dummy));
			//}

			//check(push(operatorStack, expression[i]));



		}

		printf("\n");
		printStack(operandStack);
		printStack(operatorStack);

		i++;
	}

	while (!isEmpty(operatorStack)) {
		int operand2, operand1;
		char sign;
		check(pop(operandStack, &operand2));
		check(pop(operandStack, &operand1));
		check(pop(operatorStack, &sign));
		check(push(operandStack, calculate(sign, operand1, operand2)));
	}

	int result;
	check(peek(operandStack, &result));
	return result;
}

void check(int returnedValue) {
	if (returnedValue == FALSE)
		exit(0);
}

int isDelimiter(const char c) {
	if (c == ' ')
		return TRUE;
	else
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

int isOperator(const char c) {
	if (c == '+' || c == '-' || c == '*' || c == '/' || c== '^')
		return TRUE;
	else
		return FALSE;

}

int isOperand(const char c) {
	if ((c >= '0') && (c <= '9'))
		return TRUE;
	else
		return FALSE;

}

int calculate(const char sign, const int operand1, const int operand2) {

	int result = INT_MIN;
	switch (sign) {
	case '+':
		result = operand1 + operand2;
		break;
	case '-':
		result = operand1 - operand2;
		break;
	case '*':
		result = operand1 * operand2;
		break;
	case '/':
		if (operand2 != 0) 
			result = operand1 / operand2;
		break;
	case '^':
		result = operand1 ^ operand2;
		break;
	}

	if (result == INT_MIN) {
		printf("The expression could not be calculated!");
		check(FALSE);
	}

	return result;

}

int getOperatorPrecedence(const char sign) {
	switch (sign) {
	case '^':
		return 4;
	case '/':
	case '*':
		return 3;
	case '+':
	case '-':
		return 2;

	case '(':
		return 1;
	}

	//if the stack is empty
	return 0;
	
}
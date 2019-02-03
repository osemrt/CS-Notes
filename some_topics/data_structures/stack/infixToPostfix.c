#include "functions.h"

/*
 *	1) Parentheses () {} []
 *	2) Exponents (right to left)
 *	3) Multiplication and Division (left to right)
 *	4) Addition and Subtraction (left to right)
 *
 *  infix-> human-readable
 *  prefix and postfix -> good for machines!
 *
 */

char* infixToPostfix(const char* expression) {
	reset();
	char* postfix = malloc(sizeof(char)*(strlen(expression) + 1));
	postfix[0] = '\0';

	for (int i = 0; i < strlen(expression); i++) {

		if (expression[i] == ' ' || expression[i] == ',') {
			continue;
		}
		else if (isOperand(expression[i])) {
			concatenate(postfix, expression[i]);
		}
		else if (isOperator(expression[i])) {
			if (!isEmpty()) {
				char taken = pop();
				if (hasHigherPrecedence(expression[i], taken)) {

					while (!isEmpty()) {
						if((taken = pop())!='(')
						concatenate(postfix,taken );
					}

				}

			}

			push(expression[i]);

		}
		else if (expression[i] == '(') {
			push(expression[i]);
		}
		else if (expression[i] == ')') {

			char taken;
			while (!isEmpty() && (taken=pop())!='(') {
				concatenate(postfix, taken);
			}


		}

	}

	while (!isEmpty()) {
		concatenate(postfix, pop());
	}

	return postfix;

}

int isOperand(const char c) {
	if ((c >= '0'&&c <= '9')|| (c >= 'a'&&c <= 'z')|| (c >= 'A'&&c <= 'Z')) {
		return TRUE;
	}

	return FALSE;
}

int hasHigherPrecedence(const char operator1, const char operator2) {

	int operator1Weight = getOperatorWeight(operator1);
	int operator2Weight = getOperatorWeight(operator2);

	if (operator2Weight > operator1Weight) {
		push(operator2);
		return TRUE;
	}
		

	push(operator2);
	return FALSE;



}

int getOperatorWeight(const char operator) {

	switch (operator) {
	case '+':return 1;
		break;
	case '-':return 1;
		break;
	case '*':return 2;
		break;
	case '/':return 2;
		break;
	case '^':return 3;
		break;
	case '(':return 0;
	}
}

void concatenate(char* postfix, const char c) {
	int length = strlen(postfix);
	postfix[length] = c;
	postfix[length + 1] = '\0';

}

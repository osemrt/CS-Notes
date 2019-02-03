#include "functions.h"

int evaluatePostfix(const char* expression) {
	reset();

	for (int i = 0; i < strlen(expression); i++) {

		if (isDelimiter(expression[i]))
			continue;

		if (isOperator(expression[i])) {
			performOperation(expression[i]);
			
		}
		else if (isNumericDigit(expression[i])) {
			int operand = 0;
			while (i < strlen(expression) && isNumericDigit(expression[i])) {
				operand = operand * 10 + expression[i] - '0';
				i++;
			}

			i--;
			push(operand);
		}
	}

	return pop();

}

int isDelimiter(const char c) {
	if (c == ' ' || c == ',')
		return TRUE;
	return FALSE;
}

int isNumericDigit(const char c) {
	if (c >= '0'&&c <= '9')
		return TRUE;
	return FALSE;
}

int isOperator(const char c) {
	if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
		return TRUE;
	return FALSE;

}

void performOperation(const char operator) {
	int operand2 = pop();
	int operand1 = pop();
	int result;

	switch (operator){
	case '+' : result = operand1 + operand2;
		break;
	case '-' : result = operand1 - operand2;
		break;
	case '/' : result = operand1 / operand2;
		break;
	case '*': result = operand1 * operand2;
	}

	push(result);

}
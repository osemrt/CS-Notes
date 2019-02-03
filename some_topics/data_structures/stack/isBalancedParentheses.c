#include "functions.h"

int isBalancedParentheses(const char* expression) {

	reset();

	for (int i = 0; i < strlen(expression); i++) {

		if (expression[i] == '(' || expression[i] == '[' || expression[i] == '{') {
			push(expression[i]);
		}
		else if (expression[i] == ')' || expression[i] == ']' || expression[i] == '}') {

			int x = pop();
			switch (expression[i])
			{
			case ')':
				if (x != '(')
					return FALSE;
				break;
			case ']':
				if (x != '[')
					return FALSE;
				break;
			case '}':
				if (x != '{')
					return FALSE;
				break;
			default : 
				return FALSE;

			}

		}

	}

	return isEmpty();


}
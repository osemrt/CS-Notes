#include "functions.h"

/*
	I have named these stack because they will be required when I want to display stacks.

*/


int main() {

	//let's create the stacks
	STACK operandStack;
	clearStack(&operandStack);
	operandStack.stackName = "OperandStack";

	STACK operatorStack;
	clearStack(&operatorStack);
	operatorStack.stackName = "OperatorStack";


	printf("The result of your infix expression is: %d.", evaluate(&operatorStack, &operandStack, getExpressionFromUser()));

	
}
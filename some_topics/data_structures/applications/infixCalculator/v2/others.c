#include "functions.h"

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
	char* expression = (char*) malloc(sizeof(char) * (strlen(temp) + 1));
	int i = 0;
	while (temp[i] != '\0') {
		expression[i] = temp[i];
		i++;
	}

	expression[i] = '\0';

	return expression;
}


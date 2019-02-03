#include "functions.h"

char* reverseString(char* s) {

	char* reversedString = malloc(sizeof(char)*(strlen(s) + 1));
	int i;

	for (i = 0; i < strlen(s); i++) {
		push(s[i]);
	}

	for (i = 0; i < strlen(s); i++) {
		reversedString[i] = pop();
	}

	reversedString[i] = NULL;
	return reversedString;
}
#ifndef HEADER
#define HEADER

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_SIZE 100
#define TRUE 1
#define FALSE 0

typedef struct STACK {
	int items[MAX_SIZE];
	char* stackName;
	int top;
}STACK;

#endif // !HEADER

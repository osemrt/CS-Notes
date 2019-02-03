#include "functions.h"

int A[MAX_SIZE];
int top = -1;

void reset() {
	top = -1;
}

void push(int x) {
	if (top == MAX_SIZE - 1) {
		printf("Stack overflow!\n");
		return;
	}
	A[++top] = x;
}

int pop() {
	if (top == -1) {
		printf("Stack underflow!\n");
		return;
	}
	return A[top--];
}

int isEmpty() {
	if (top == -1)
		return TRUE;
	return FALSE;
}



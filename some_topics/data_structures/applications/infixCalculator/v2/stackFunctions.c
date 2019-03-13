#include "functions.h"

void clearStack(struct STACK* stack) {
	stack->top = -1;
}

int isFull(STACK* stack) {
	if (stack->top == MAX_SIZE - 1)
		return TRUE;
	else 
		return FALSE;	
}

int isEmpty(struct STACK* stack) {
	if (stack->top == -1)
		return TRUE;
	else
		return FALSE;
}

int push(struct STACK* stack, int data) {
	if (isFull(stack)) {
		printf("Stack Overflow!");
		return FALSE;
	}
	else {
		stack->items[++stack->top] = data;
		return TRUE;
	}
}

int pop(struct STACK* stack, int* data) {
	if (isEmpty(stack)) {
		printf("Stack Underflow!");
		return FALSE;
	}
	else {
		*data = stack->items[stack->top--];
		return TRUE;
	}
}

int peek(struct STACK* stack, int* data) {
	if (isEmpty(stack)) {
		return FALSE;
	}
	else {
		*data = stack->items[stack->top];
		return TRUE;
	}
}

void printStack(struct STACK* stack) {

	if (!strcmp(stack->stackName, "OperandStack")) {
		fprintf(stderr,"OperandStack: ");
		if (isEmpty(stack)) {
			printf("Empty!\n");
		}
		else {
			for (int i = stack->top; i >= 0; i--) {
				printf("%d ", stack->items[i]);
			}
			printf("\n");
		}

	}
	//for OperatorStack
	else {
		printf("OperatorStack: ");
		if (isEmpty(stack)) {
			printf("Empty!\n");
		}
		else {
			for (int i = stack->top; i >= 0; i--) {
				printf("%c ", stack->items[i]);
			}
			printf("\n");
		}

	}
}
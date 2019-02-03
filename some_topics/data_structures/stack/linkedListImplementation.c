#include "functions.h"

typedef struct node{
	int data;
	struct node* prev;
	
}NODE;

NODE* top = NULL; 

void push(int x) {
	NODE* temp = malloc(sizeof(NODE));
	temp->data = x;
	temp->prev = top;
	top = temp;

}

int pop() {
	if (top == NULL) {
		printf("Stack overflow!\n");
		return NULL;
	}
		

	NODE* temp = top;
	int x = top->data;
	top = top->prev;
	free(temp);
	return x;
}

int isEmpty() {
	if (top == NULL)
		return TRUE;
	return FALSE;
}
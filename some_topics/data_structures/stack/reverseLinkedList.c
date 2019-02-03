#include "functions.h"

struct node* A_LS[MAX_SIZE];
int top_LS = -1;

void push_LS(struct node* x) {
	if (top_LS == MAX_SIZE - 1) {
		printf("Stack overflow!\n");
		return;
	}
	A_LS[++top_LS] = x;
}

struct node* pop_LS() {
	if (top_LS == -1) {
		printf("Stack underflow!\n");
		return;
	}
	return A_LS[top_LS--];
}

int isEmpty_LS() {
	if (top_LS == -1)
		return TRUE;
	return FALSE;
}

void reverseLinkedList(struct node** pointerToHEAD) {

	struct node *temp, *HEAD = *pointerToHEAD;
	while (HEAD != NULL) {
		push_LS(HEAD);
		HEAD = HEAD->next;
	}

	HEAD = pop_LS();
	*pointerToHEAD = HEAD;
	while (!isEmpty_LS()) {
		temp = pop_LS();
		HEAD->next = temp;
		HEAD = temp;
	}

	HEAD->next = NULL;
}




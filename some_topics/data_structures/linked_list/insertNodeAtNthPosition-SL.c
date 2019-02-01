#include "functions.h"

void insertNodeAtNthPositionSL(struct node** pointerToHEAD, int position, int data) {

	struct node* temp = malloc(sizeof(struct node));
	temp->data = data;
	temp->next = NULL;

	if (*pointerToHEAD == NULL) {
		*pointerToHEAD = temp;
		return;
	}

	struct node* HEAD = *pointerToHEAD;
	for (int i = 0; i < position-2; i++) {
		*pointerToHEAD = (*pointerToHEAD)->next;

	}

	temp->next = (*pointerToHEAD)->next;
	(*pointerToHEAD)->next = temp;

	*pointerToHEAD = HEAD;

}


#include "functions.h"

void insertNodeAtNthPositionDL(struct node** pointerToHEAD, int position, int data) {


	struct node* temp = malloc(sizeof(struct node));
	temp->prev = NULL;
	temp->data = data;
	temp->next = NULL;

	struct node* HEAD = *pointerToHEAD;
	for (int i = 0; i < position-2; i++) {
		*pointerToHEAD = (*pointerToHEAD)->next;
	}

	temp->prev = (*pointerToHEAD);
	temp->next = (*pointerToHEAD)->next;
	(*pointerToHEAD)->next = temp;
	(*pointerToHEAD)->next->prev = temp;


	*pointerToHEAD = HEAD;


}
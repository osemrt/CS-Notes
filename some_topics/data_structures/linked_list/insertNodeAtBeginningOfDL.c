#include "functions.h"

void insertNodeAtBeginningOfDL(struct node** pointerToHEAD, int data) {

	struct node* temp = malloc(sizeof(struct node));
	temp->prev = NULL;
	temp->data = data;
	temp->next = *pointerToHEAD;
	(*pointerToHEAD)->prev = temp;

	*pointerToHEAD = temp;

}
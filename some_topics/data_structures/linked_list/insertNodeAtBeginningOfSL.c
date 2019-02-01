#include "functions.h"


void insertNodeAtBeginningOfSL(struct node** pointerToHEAD, int data) {

	struct node* temp = malloc(sizeof(struct node));
	temp->data = data;
	temp->next = *pointerToHEAD;
	
	*pointerToHEAD = temp;

}
#include "functions.h"

void deleteNodeAtNthPositionSL(struct node** pointerToHEAD, int position) {

	struct node* HEAD = *pointerToHEAD;
	if (position == 0) {
		*pointerToHEAD = (*pointerToHEAD)->next;
		free(HEAD);
		return;
	}

	
	for (int i = 0; i < position-2; i++) {
		(*pointerToHEAD) = (*pointerToHEAD)->next;
	}

	struct node* temp = (*pointerToHEAD)->next;
	(*pointerToHEAD)->next = temp->next;
	free(temp);
	*pointerToHEAD = HEAD;
}
 
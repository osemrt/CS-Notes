#include "functions.h"

void deleteNodeAtNthPositionDL(struct node** pointerToHEAD, int position) {

	
	if (position == 0) {
		*pointerToHEAD = (*pointerToHEAD)->next;
		(*pointerToHEAD)->prev = NULL;

	}
	else {
		struct node* HEAD = *pointerToHEAD;
		for (int i = 0; i < position; i++) {
			*pointerToHEAD = (*pointerToHEAD)->next;
		}

		(*pointerToHEAD)->prev->next = (*pointerToHEAD)->next;
		(*pointerToHEAD)->next->prev = (*pointerToHEAD)->prev;

		*pointerToHEAD = HEAD;

		
	}
	

}

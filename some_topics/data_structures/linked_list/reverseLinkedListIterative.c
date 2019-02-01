#include "functions.h"

void reverseLinkedListIterative(struct node** pointerToHEAD) {

	struct node *prev, *current, *next;

	current = *pointerToHEAD;
	prev = NULL;

	while (current != NULL) {
		next = current->next;
		current->next = prev;
		prev = current;
		current = next;
	}

	*pointerToHEAD = prev;


}
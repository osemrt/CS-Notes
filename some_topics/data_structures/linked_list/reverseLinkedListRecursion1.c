#include "functions.h"

void reverseLinkedListRecursion1(struct node** pointerToHEAD) {

	struct node* first;
	struct node* rest;

	if (*pointerToHEAD == NULL)
		return;

	first = *pointerToHEAD;
	rest = first->next;

	if (rest == NULL)
		return;

	reverseLinkedListRecursion1(&rest);

	first->next->next = first;
	first->next = NULL;

	*pointerToHEAD = rest;



}
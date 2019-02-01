#include "functions.h"

struct node* reverseLinkedListRecursion2(struct node* HEAD) {

	if (HEAD->next == NULL || HEAD == NULL) {
		return HEAD;
	}

	struct node* reversedHEAD = reverseLinkedListRecursion2(HEAD->next);

	HEAD->next->next = HEAD;
	HEAD->next = NULL;

	return reversedHEAD;
}
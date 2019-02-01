#include "functions.h"

void printLinkedListUsingRecursion(struct node* HEAD, int direction) {

	if (direction == FORWARD_ORDER) {

		printf("%d -> ", HEAD->data);

		if (HEAD->next != NULL) {
			printLinkedListUsingRecursion(HEAD->next, direction);
		}


	}
	else {

		if (HEAD->next != NULL) {
			printLinkedListUsingRecursion(HEAD->next, direction);
		}

		printf("%d -> ", HEAD->data);

	}


}
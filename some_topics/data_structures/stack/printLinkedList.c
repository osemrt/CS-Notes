#include "functions.h"

void printLinkedList(const struct node* HEAD) {

	while (HEAD != NULL) {

		printf("%d -> ", HEAD->data);
		HEAD = HEAD->next;

	}

	printf("%s\n", "null");

}

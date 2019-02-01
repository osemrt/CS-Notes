#include "functions.h"

int main() {

	struct node* HEAD = createLinkedListSL(10);
	printLinkedList(HEAD);
	
	insertNodeAtBeginningOfSL(&HEAD, 63);
	printLinkedList(HEAD);

	insertNodeAtNthPositionSL(&HEAD, 3, 95);
	printLinkedList(HEAD);

	deleteNodeAtNthPositionSL(&HEAD, 3);
	printLinkedList(HEAD);

	reverseLinkedListIterative(&HEAD);
	printLinkedList(HEAD);

	printLinkedListUsingRecursion(HEAD, FORWARD_ORDER);
	printf("null \n");

	printLinkedListUsingRecursion(HEAD, REVERSE_ORDER);
	printf("null \n");
	
	reverseLinkedListRecursion1(&HEAD);
	printLinkedList(HEAD);

	HEAD = reverseLinkedListRecursion2(HEAD);
	printLinkedList(HEAD);

	///////////////////////////////////////////

	HEAD = createLinkedListDL(10);
	printLinkedList(HEAD);
	
	insertNodeAtBeginningOfDL(&HEAD, 78);
	printLinkedList(HEAD);

	insertNodeAtNthPositionDL(&HEAD, 2, 99);
	printLinkedList(HEAD);

	deleteNodeAtNthPositionDL(&HEAD, 2);
	printLinkedList(HEAD);


	scanf("\n");
	return 0;
}
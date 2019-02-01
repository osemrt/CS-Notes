#include "functions.h"

struct node* getNewNode(int x) {

	struct node* newNode = malloc(sizeof(struct node));
	newNode->prev = NULL;
	newNode->data = x;
	newNode->next = NULL;

	return newNode;
}

struct node* createLinkedListDL(int n) {

	struct node* HEAD = NULL;
	struct node* p = NULL;

	for (int i = 0; i < n; i++) {

		if (HEAD == NULL) {
			HEAD = getNewNode(i);
		}
		else {

			p = HEAD;

			while (p->next!=NULL) {
				p = p->next;
			}

			p->next = getNewNode(i);
			p->next->prev = p;
			
		}


	}

	return HEAD;


}
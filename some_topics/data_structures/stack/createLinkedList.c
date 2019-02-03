#include "functions.h"


struct node* createLinkedListSL(int n) {

	struct node* HEAD = NULL;
	struct node* temp = NULL;
	struct node* p = NULL;


	for (int i = 0; i < n; i++) {

		temp = malloc(sizeof(struct node));
		temp->data = i * 10;
		temp->next = NULL;

		if (HEAD == NULL) {
			HEAD = temp;
		}
		else {

			p = HEAD;

			while (p->next != NULL) {
				p = p->next;
			}

			p->next = temp;


		}
	}

	return HEAD;

}

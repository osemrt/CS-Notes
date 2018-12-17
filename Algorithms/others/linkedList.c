#include <stdio.h>
#include <stdlib.h>

typedef struct node {
	int val;
	struct node* next;

}node;


node* createLinkedList(int);
void printLinkedList(node* HEAD);


int main() {

	srand(time(NULL));
	int n = rand() % 50 + 1;

	node* HEAD = createLinkedList(n);
	printLinkedList(HEAD);

	return 0;
}

node* createLinkedList(int n) {

	node* head = NULL;
	node* temp = NULL;
	node* p = NULL;

	for (int i = 0; i < n; i++) {

		temp = malloc(sizeof(node));
		temp->next = NULL;
		temp->val = i * 10;

		if (head == NULL) {
			head = temp;
		}
		else {

			p = head;

			while (p->next != NULL)
				p = p->next;

			p->next = temp;

		}
	}

	return head;

}

void printLinkedList(node* HEAD) {

	while (HEAD != NULL) {
		printf("%d->", HEAD->val);
		HEAD = HEAD->next;
	}

	printf("NULL");

}

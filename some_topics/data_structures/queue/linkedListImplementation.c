#include "functions.h"

NODE* HEAD = NULL;
NODE* TAIL = NULL;

void enQueue_LS(int x) {
	NODE* temp = malloc(sizeof(struct node));
	temp->data = x;
	temp->next = NULL;

	if (TAIL == NULL && HEAD == NULL) {
		TAIL = HEAD = temp;
	}
	else {
		TAIL->next = temp;
		TAIL = TAIL->next;
	}
}

void deQueue_LS() {
	if (HEAD == NULL) {
		printf("The queue is now empty!");
		return;
	}
	else if (HEAD == TAIL) {
		HEAD = TAIL = NULL;
	}
	else {
		struct node* temp = HEAD;
		HEAD = HEAD->next;
		free(temp);

	}

}

int getFront_LS(){
	if (HEAD == NULL) {
		printf("The queue is empty!");
		return;
	}
	return HEAD->data;
}

void printQueue_LS() {	

	NODE* temp = HEAD;
	while (temp != NULL) {
		printf("%d -> ", temp->data);
		temp = temp->next;
	}
	printf("%s", "null\n");

}

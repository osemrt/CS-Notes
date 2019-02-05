#include "functions.h"

int Queue[MAX_SIZE];
int front = -1;
int rear = -1;


void enQueue(int x) {

	if (isFull()) {
		printf("The queue is now full!\n");
		return;
	}
	else if (isEmpty()) {
		front = rear = 0;
	}
	else {
		rear = (rear + 1) % MAX_SIZE;
	}

	Queue[rear] = x;

}

void deQueue() {

	if (front == rear) {
		front = rear = -1;
	}
	else if (isEmpty()) {
		printf("Cannot remove any element from an empty queue!\n");
		return;
	}
	else {
		front = (front + 1) % MAX_SIZE;
	}


}

int getFront() {
	if (front == -1) {
		printf("Cannot return front element from an empty queue!\n");
		return FALSE;
	}
	return Queue[front];
}

void printQueue() {

	int count = (rear - front + MAX_SIZE) % MAX_SIZE + 1;
	for (int i = 0; i < count; i++) {
		printf("%d : ", Queue[(front + i) % MAX_SIZE]);
	}

	printf("\n");
}


int isEmpty() {
	if (front == -1 && rear == -1)
		return TRUE;
	return FALSE;
}

int isFull(){
	if ((rear + 1) % MAX_SIZE == front)
		return TRUE;
	return FALSE;
}

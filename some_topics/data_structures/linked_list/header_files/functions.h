#ifndef FUNCTIONS
#define FUNCTIONS

#include "header.h"

void printLinkedList(struct node* HEAD);
struct node* createLinkedListSL(int n);
void insertNodeAtBeginningOfSL(struct node** HEAD, int data);
void insertNodeAtNthPositionSL(struct node** pointerToHEAD, int position, int data);
void deleteNodeAtNthPositionSL(struct node** pointerToHEAD, int position);

void reverseLinkedListIterative(struct node** pointerToHEAD);
void printLinkedListUsingRecursion(struct node* HEAD, int direction);
void reverseLinkedListRecursion1(struct node** pointerToHEAD);
struct node* reverseLinkedListRecursion2(struct node* HEAD);

struct node* createLinkedListDL(int n);
void insertNodeAtBeginningOfDL(struct node** pointerToHEAD, int data);
void deleteNodeAtNthPositionDL(struct node** pointerToHEAD, int position);
void insertNodeAtNthPositionDL(struct node** pointerToHEAD, int position, int data);

#endif

#ifndef HEADER
#define HEADER

#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 5
#define TRUE 1
#define FALSE 0

typedef struct node {
	int data;
	struct node* next;
}NODE;

#endif // !HEADER

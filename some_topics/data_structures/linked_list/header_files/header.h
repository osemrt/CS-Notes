#ifndef HEADER
#define HEADER

#include <stdio.h>
#include <stdlib.h>

#define REVERSE_ORDER 1
#define FORWARD_ORDER 0

struct node {
	int data;
	struct node* next;
	struct node* prev;
};




#endif
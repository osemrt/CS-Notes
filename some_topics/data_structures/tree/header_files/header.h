#ifndef  HEADER
#define HEADER

#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0
#define MAX_SIZE 20

#define PRE_ORDER -1
#define IN_ORDER 0
#define POST_ORDER 1

typedef struct node {
	int data;
	struct node* left;
	struct node* right;
}NODE;


#endif // ! HEADER

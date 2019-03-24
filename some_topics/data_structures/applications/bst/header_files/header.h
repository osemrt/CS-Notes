#ifndef HEADER
#define HEADER

#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0

#define PREORDER -1
#define INORDER 0
#define POSTORDER 1

#define MAX(a,b) ((a) > (b) ? (a) : (b))
#define MIN(a,b) ((a) > (b) ? (b) : (a))

#define ABSOLUTE(a,b) ((a) - (b) < 0 ? (b) - (a) : (a) - (b))

typedef struct {
	int data;
	struct NODE* left;
	struct NODE* right;
	
}NODE;




#endif // !HEADER

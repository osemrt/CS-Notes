#include "functions.h"

NODE* createNode(int data) {


	NODE* node = (NODE*)malloc(sizeof(NODE));
	node->left = NULL;
	node->right = NULL;
	node->data = data;

	return node;

}
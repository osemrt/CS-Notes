#include "functions.h"


void deleteNode(NODE** pointerToRoot, const int data) {

	NODE** delNode = findNode(pointerToRoot, data);

	if ((*delNode) == NULL) {
		return;
	}
	else if ((*delNode)->left == NULL && (*delNode)->right == NULL) {
		NODE* temp = *delNode;
		*delNode = NULL;
		free(temp);
	}
	else if ((*delNode)->left == NULL) {
		NODE* temp = *delNode;
		*delNode = (*delNode)->right;
		free(temp);
	}
	else if ((*delNode)->right == NULL) {
		NODE* temp = *delNode;
		*delNode = (*delNode)->left;
		free(temp);
	}
	else {
		//(*delNode)->left != NULL && (*delNode)->right != NULL
		NODE** maxNode = findMax(&(*delNode)->left);
		(*delNode)->data = (*maxNode)->data;
		deleteNode(&(*delNode)->left, (*maxNode)->data);
	}

}

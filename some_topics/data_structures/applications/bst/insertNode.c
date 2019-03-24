#include "functions.h"

void insertNode1(const NODE** pointerToRoot, int data) {

	if ((*pointerToRoot) == NULL) {
		(*pointerToRoot) = createNode(data);
	}
	else if ((*pointerToRoot)->data > data) {
		insertNode1(&(*pointerToRoot)->left, data);
	}
	else {
		//(*pointerToRoot)->data <= data
		insertNode1(&(*pointerToRoot)->right, data);
	}

}

NODE* insertNode2(NODE* root, int data) {

	if (root == NULL) {
		return createNode(data);
	}
	else if (root->data > data) {
		root->left = insertNode2(root->left, data);
		
	}
	else {
		//root->data <= data
		root->right = insertNode2(root->right, data);
		
	}

	return root;

}
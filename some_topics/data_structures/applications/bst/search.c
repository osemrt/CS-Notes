#include "functions.h"


int search(const NODE* root, const int data) {

	if (root == NULL) {
		return FALSE;
	}
	else if (root->data > data) {
		return search(root->left, data);
	}
	else if (root->data < data) {
		return search(root->right, data);
	}
	else {
		//root->data is equals to data
		return TRUE;

	}
}
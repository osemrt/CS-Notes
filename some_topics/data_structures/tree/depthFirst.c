#include "functions.h"

void depthFirst(const NODE* root, int mode) {

	if (mode == PRE_ORDER) {
		if (root == NULL)
			return;
		printf("%d ", root->data);
		depthFirst(root->left, mode);
		depthFirst(root->right, mode);
	}
	else if (mode == IN_ORDER) {
		if (root == NULL)
			return;
		depthFirst(root->left, mode);
		printf("%d ", root->data);
		depthFirst(root->right, mode);
	}
	else {
		if (root == NULL)
			return;
		depthFirst(root->left, mode);
		depthFirst(root->right, mode);
		printf("%d ", root->data);
	}


}
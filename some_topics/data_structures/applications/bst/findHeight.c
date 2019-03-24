#include "functions.h"

int findHeight(const NODE* root) {

	if (root==NULL) {
		//for leaves
		return -1;
	}
	else {
		return 1 + MAX(findHeight(root->left), findHeight(root->right));
	}

}
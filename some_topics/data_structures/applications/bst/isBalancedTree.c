#include "functions.h"

int isBalancedTree(const NODE* root) {

	if (root == NULL)
		//for leaves
		return -1;

	if ((ABSOLUTE(findHeight(root->right), findHeight(root->left)) <= 1) && isBalancedTree(root->left) && isBalancedTree(root->right)) {
		return TRUE;
	}
	else {
		return FALSE;
	}
}
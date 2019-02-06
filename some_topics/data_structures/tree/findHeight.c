#include "functions.h"

int findHeight(const NODE* root) {

	if (root == NULL)
		return -1;

	int leftHeight = findHeight(root->left);
	int rightHeight = findHeight(root->right);
	
	return max(leftHeight, rightHeight) + 1;


}

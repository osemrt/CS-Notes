#include "functions.h"

int isBinarySearchTree_S2(const NODE* root) {

	return isBST_Util(root, INT_MIN, INT_MAX);

}

int isBST_Util(const NODE* root, int minValue, int maxValue) {

	if (root == NULL) {
		return TRUE;
	}
	else if (root->data <maxValue && root->data >minValue
			 && isBST_Util(root->left, minValue, root->data)
			 && isBST_Util(root->right, root->data, maxValue)) {
		return TRUE;
	}
	else {
		return FALSE;
	}

}



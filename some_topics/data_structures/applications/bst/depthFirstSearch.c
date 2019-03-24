#include "functions.h"

void depthFirstSearch(const NODE* root, int mode) {

	if (root == NULL)
		return;

	switch (mode)
	{
	case PREORDER:
		printf("%d ", root->data);
		depthFirstSearch(root->left, mode);
		depthFirstSearch(root->right, mode);
		break;
	case INORDER:		
		depthFirstSearch(root->left, mode);
		printf("%d ", root->data);
		depthFirstSearch(root->right, mode);
		break;
	case POSTORDER:
		depthFirstSearch(root->left, mode);
		depthFirstSearch(root->right, mode);
		printf("%d ", root->data);
		break;
	}

}
	

	
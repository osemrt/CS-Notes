#include "functions.h"

void deleteNode(NODE** pointerToRoot, int data) {

	NODE* root = (*pointerToRoot);
	NODE* del = getAddress(root, data);

	if (del == NULL) {
		return NULL;
	}
	else if (del->left == NULL && del->right == NULL) {
		free(del);
		del = NULL;
	}
	else if (del->left == NULL) {
		NODE* temp = del;
		del = del->right;
		free(temp);

	}
	else if (del->right == NULL) {
		NODE* temp = del;
		del = del->left;
		free(temp);
	}
	else {

		NODE* temp = findMin(root->right);
		del->data = temp->data;
		deleteNode(&(del->right), temp->data);

	}

	*pointerToRoot = root;

}

NODE* deleteNode2(NODE* root, int data) {


	if (root == NULL) {
		return NULL;
	}
	else if (data < root->data) {
		root->left = deleteNode2(root->left, data);
	}
	else if (data > root->data) {
		root->right = deleteNode2(root->right, data);
	}
	else {



		if (root->left == NULL && root->right == NULL) {
			free(root);
			root = NULL;
		}
		else if (root->left == NULL) {
			NODE *temp = root;
			root = root->right;
			free(temp);
		}
		else if (root->right == NULL) {
			NODE *temp = root;
			root = root->left;
			free(temp);
		}
		else {
			NODE *temp = findMin(root->right);
			root->data = temp->data;
			root->right = deleteNode2(root->right, temp->data);
		}



	}

	return root;



}
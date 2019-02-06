#include "functions.h"

int isBinarySearchTree_S1(const NODE* root) {


	if (root == NULL) {
		return TRUE;
	}
	else if (
		isSubtreeGreater(root->right, root->data) 
		&& isSubtreeLesser(root->left, root->data)
		&& isBinarySearchTree_S1(root->left)
		&& isBinarySearchTree_S1(root->right)
		) {
		return TRUE;
	}
	else {
		return FALSE;
	}
}

int isSubtreeLesser(const NODE* root, int value) {
	if (root == NULL) {
		return TRUE;
	}
	else if (root->data <= value
		&& isSubtreeLesser(root->left, value)
		&& isSubtreeLesser(root->right, value)) {
		return TRUE;
	}
	else {
		return FALSE;
	}

}

int isSubtreeGreater(const NODE* root, int value) {
	if (root == NULL) {
		return TRUE;
	}
	else if (root->data > value
		&& isSubtreeGreater(root->left, value) 
		&& isSubtreeGreater(root->right, value)) {
		return TRUE;
	}
	else {
		return FALSE;
	}
}
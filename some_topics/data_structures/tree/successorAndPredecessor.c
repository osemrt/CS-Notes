#include "functions.h"
/*

	The successor of a node x is the node with the smallest key grater than x. 
	3 conditions to find a successor
		> the node x has a RIGHT subtree.
		> the node x does not have a right subtree; it is the right child of its parent node.
		> the node x does not have a right subtree; it is the left child of its parent node.


	The predecessor of a node x is the node with the greatest key smaller than x.
	3 conditions to find a predecessor
		> the node x has a LEFT subtree.
		> the node x does not have a left subtree; it is the left child of its parent node.
		> the node x does not have a left subtree; it is the right child of its parent node.

*/



NODE* findSuccessor(const NODE* root, int data) {

	NODE* current = getAddress(root, data);

	if (current == NULL) {
		return NULL;
	}
	else if (current->right != NULL) {
		return findMin(current->right);
	}
	else if (current == findMax(root->right)) {
		printf("No any successor for %d in the tree! (Returned the root)\t", data);
		return root;
	}
	else {

		NODE* successor = NULL;
		while (current != root) {
			if (root->data > data) {
				successor = root;
				root = root->left;
			}
			else {
				root = root->right;
			}
		}

		return successor;

	}


}

NODE* findPredecessor(const NODE* root, int data) {

	NODE* current = getAddress(root, data);

	if (current == NULL) {
		return NULL;
	}
	else if (current->left != NULL) {
		return findMax(current->left);
	}
	else if (current == findMin(root->left)) {
		printf("No any predecessor for %d in the tree! (Returned the root)\t", data);
		return root;
	}
	else {

		NODE* predecessor = NULL;
		while (current != root) {
			if (root->data < data) {
				predecessor = root;
				root = root->right;
			}
			else {
				root = root->left;
			}
		}

		return predecessor;

	}

}

NODE* getAddress(const NODE* root, int data) {


	if (root == NULL) {
		return NULL;
	}
	else if (root->data == data) {
		return root;
	}
	else if (root->data >= data) {
		getAddress(root->left, data);
	}
	else {
		getAddress(root->right, data);
	}


}

NODE* findMin(const NODE* root) {
	if (root == NULL) {
		return NULL;
	}
	else if (root->left == NULL) {
		return root;
	}
	else {
		findMin(root->left);
	}

}

NODE* findMax(const NODE* root) {
	if (root == NULL) {
		return NULL;
	}
	else if (root->right != NULL) {
		findMax(root->right);
	}
	else {
		return root;
	}
}

#include "functions.h"

/***********************************************************************************************

	Binary Tree: A binary tree in which for each node, the value of all the nodes in left 
	subtree is lesser or equal and value of all the nodes in right subtree is greater.

				  |   Array		|  Linked	|  Array	  |  Binary Search |
		          | (Unsorted)	|   List 	| (sorted)	  |	   Tree	(BST)  |
		----------|-------------|-----------|-------------|----------------|
		Search(x) |	  O(n)		|	O(n)	| O(log2(n))  |	 O(log2(n))	   |
		Insert(x) |	  O(1)		|	O(1)	|	O(n)	  |	 O(log2(n))	   |
		Remove(x) |	  O(n)		|	O(n)	|	O(n)	  |	 O(log2(n))	   |

***********************************************************************************************/



void insert(NODE** pointerToRoot, int data) {
	NODE* root = *pointerToRoot;

	if (root == NULL) {
		root = getNewNode(data);
	}
	else if (data >= root->data) {
		insert(&(root->right), data);
	}
	else {
		insert(&(root->left), data);
	}

	*pointerToRoot = root;
}


NODE* getNewNode(int data) {

	NODE* temp = malloc(sizeof(struct node));
	temp->data = data;
	temp->left = NULL;
	temp->right = NULL;

	return temp;
}

int search(const NODE* pointerToRoot, int data) {

	if (pointerToRoot == NULL) {
		return FALSE;
	}
	else if (data < pointerToRoot->data) {
		search(pointerToRoot->left, data);
	}
	else if (data == pointerToRoot->data) {
		return TRUE;
	}
	else {
		search(pointerToRoot->right, data);
	}

}

int findMinValue(const NODE* root) {

	if (root == NULL) {
		printf("Tree is empty!");
		return -1;
	}
	else if (root->left == NULL) {
		return root->data;
	}
	else {
		return findMinValue(root->left);
	}

}

int findMaxValue(const NODE* root) {

	if (root == NULL) {
		printf("Tree is empty!");
		return -1;
	}
	
	while (root->right != NULL) {
		root = root->right;
	}

	return root->data;

}
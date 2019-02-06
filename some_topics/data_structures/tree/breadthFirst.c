#include "functions.h"

/*
	
	Process of visiting each node in the tree exactly once in some order.
	----------------
	Tree traversal
	----------------
	-> Breadth-First (level order)
		Time-complexity O(n).
		Space-complexity O(1) best, O(n) worst.
	-> Depth-First (<root><left><right> : preorder, <left><root><right> : inorder, <left><right><root> : postorder,)
		Time-complexity O(n).
		Space-complexity O(h), best/average O(log2(n)), worst O(n)

*/

void breadthFirstTraversal(const NODE* root) {

	if (root == NULL)
		return;

	enQueue(root);
	

	while (!isEmpty()) {
		NODE* current = getFront();
		deQueue();
		printf("%d ", current->data);
		if (current->left != NULL)
			enQueue(current->left);
		if (current->right != NULL)
			enQueue(current->right);
	}
	   
}
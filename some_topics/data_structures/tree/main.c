#include "functions.h"

/***********************************************************************************************
   while array, Linked List, Stack, and Queue is a linear data structure, trees are a non-linear 
   data structure. How should I decide which data structure use?
   -> What needs to be stored ?
   -> Cost of operations.
   -> Memory consumption.
   -> Ease of implementation.
  --------------------------
   N nodes -> N-1 edges or links.
   Depth of x = length of path from root to x = # of edges in path from root to x.
   Height of x = # of edges in longest path from x to a leaf.
   Height of a tree = height of root node.
   Height of an empty tree = -1
   Height of tree with 1 node = 0
   diff = | leftsubtree_height - rightsubtree_height |﻿
   Max # of nodes in a binary tree with height h = 2^0 + 2^1 + 2^2 + ... + 2^h  = 2^(h+1) -1 = 2^(# of levels) -1.
   Height of perfect binary tree is = log2(n+1) -1
   Height of complete binary tree is floor(log2(n))
   In a tree min-height = floor(log2(n)), max-height = n-1
   Max # of nodes at level i = 2^i.
  --------------------------
   Binary tree = a tree in which each node can have at most 2 children.
   Full / Strict / Proper binary tree = each node can have either 2 or 0 children.
   Complete binary tree = all levels except possibly the last are completely filled and all nodes are as left as possible.
   Balanced binary tree = difference between height of left and right subtree for every node is not more than k(mostly 1).
   for more -> https://codepumpkin.com/binary-tree-types-introduction/
  ---------------------------------------------------------------------------------------------
   Applications					  
  ---------------------------  	  
   -> Storing naturally hierarchical data (eg: file system)
   -> Organize data (for quick search, insertion, deletion)
   -> Trie tree is used to store dictionary.
   -> Network routing algorithms.
   ...
***********************************************************************************************/


int main() {

	NODE* root = NULL;

	/*
			      27
				/    \
			   /      \
			  14       35
			 / \      /  \
			10   19  31  42
	
	*/

	insert(&root, 27);
	insert(&root, 14);
	insert(&root, 35);
	insert(&root, 10);
	insert(&root, 19);
	insert(&root, 31);
	insert(&root, 42);

	printf("%d\n", search(root, 10));
	printf("%d\n", search(root, 63));

	printf("Min Value : %d\n", findMinValue(root));
	printf("Max Value : %d\n", findMaxValue(root));

	printf("Height : %d\n", findHeight(root));

	printf("Breadth-First : ");
	breadthFirstTraversal(root);

	printf("\n\nDepth-First\n----------\nPreorder : ");
	depthFirst(root, PRE_ORDER);
	printf("\nInorder : ");
	depthFirst(root, IN_ORDER);
	printf("\nPostorder : ");
	depthFirst(root, POST_ORDER);

	NODE* root2 = NULL;
	insert(&root2, 10);
	insert(&root2, 23);
	insert(&root2, 64);
	insert(&root2, 87);
	insert(&root2, 46);
	insert(&root2, 99);
	insert(&root2, 41);
	root2->right->data = 5;


	printf("\nisBST : %d \n", isBinarySearchTree_S1(root));
	printf("isBST : %d \n", isBinarySearchTree_S1(root2));

	printf("\nisBST : %d \n", isBinarySearchTree_S2(root));
	printf("isBST : %d \n", isBinarySearchTree_S2(root2));

	printf("The successor of 27 is %d.\n", (findSuccessor(root, 27))->data);
	printf("The successor of 14 is %d.\n", (findSuccessor(root, 14))->data);
	printf("The successor of 35 is %d.\n", (findSuccessor(root, 35))->data);
	printf("The successor of 10 is %d.\n", (findSuccessor(root, 10))->data);
	printf("The successor of 19 is %d.\n", (findSuccessor(root, 19))->data);
	printf("The successor of 31 is %d.\n", (findSuccessor(root, 31))->data);
	printf("The successor of 42 is %d.\n", (findSuccessor(root, 42))->data);

	printf("\n------------------\n");

	printf("The predecessor of 27 is %d.\n", (findPredecessor(root, 27))->data);
	printf("The predecessor of 14 is %d.\n", (findPredecessor(root, 14))->data);
	printf("The predecessor of 35 is %d.\n", (findPredecessor(root, 35))->data);
	printf("The predecessor of 10 is %d.\n", (findPredecessor(root, 10))->data);
	printf("The predecessor of 19 is %d.\n", (findPredecessor(root, 19))->data);
	printf("The predecessor of 31 is %d.\n", (findPredecessor(root, 31))->data);
	printf("The predecessor of 42 is %d.\n", (findPredecessor(root, 42))->data);

	//deleteNode(&root, 10); ERROR!
	root = deleteNode2(root, 14);
	breadthFirstTraversal(root);

	printf("\n------------------\n");
	insertArray(10, 1);
	insertArray(23, 2);
	insertArray(64, 3);
	insertArray(87, 4);
	insertArray(46, 5);
	insertArray(99, 6);
	insertArray(41, 7);

	printArray();
	



	scanf("\n");
	return 0;
}
#include "functions.h"



int main() {

	struct NODE* root = NULL;

	insertNode1(&root, 47);
	insertNode1(&root, 31);
	insertNode1(&root, 34);
	insertNode1(&root, 31);
	insertNode1(&root, 19);
	insertNode1(&root, 25);
	
	root = insertNode2(root, 14);
	root = insertNode2(root, 18);
	root = insertNode2(root, 3);
	root = insertNode2(root, 13);
	root = insertNode2(root, 5);
	root = insertNode2(root, 74);
	root = insertNode2(root, 71);
	root = insertNode2(root, 68);
	root = insertNode2(root, 59);
	
	printTree(root);


	
		
	if (search(root, 2) == TRUE)
		printf("%s", "Found!\n");
	else
		printf("%s", "Not Found!\n");

	if (search(root, 100) == TRUE)
		printf("%s", "Found!\n");
	else
		printf("%s", "Not Found!\n");


	if (search(root, 19) == TRUE)
		printf("%s", "Found!\n");
	else
		printf("%s", "Not Found!\n");

	printf("The height of the tree: %d", findHeight(root));

	//deleteNode(&root, 34);
	printTree(root);


	printf("The height of the tree: %d\n", findHeight(root));

	printf("\nPreorder:");
	depthFirstSearch(root, PREORDER);
	
	printf("\nInorder:");
	depthFirstSearch(root, INORDER);
	
	printf("\nPostorder:");
	depthFirstSearch(root, POSTORDER);


	NODE* root2 = NULL;
	insertNode1(&root2, 5);
	insertNode1(&root2, 1);
	insertNode1(&root2, 6);
	insertNode1(&root2, 0);
	insertNode1(&root2, 3);
	insertNode1(&root2, 7);


	if (isBalancedTree(root) == TRUE)
		printf("%s", "\nBalanced!");
	else
		printf("%s", "\nNot Balanced!");

	if (isBalancedTree(root2) == TRUE)
		printf("%s", "\nBalanced!");
	else
		printf("%s", "\nNot Balanced!");
	


	return 0;
}


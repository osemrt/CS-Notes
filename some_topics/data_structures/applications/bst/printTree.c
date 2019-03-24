#include "functions.h"

//Wrapper over print2D
void printTree(const NODE* root) {
	print2D(root, 0);

}

void print2D(const NODE* root, int space) {

	if (root != NULL) {

		space += 10;
		print2D(root->right, space);

		for (int i = 10; i < space; i++) {
			printf("%c", ' ');
		}

		printf("%d\n", root->data);

		print2D(root->left, space);

	}
}


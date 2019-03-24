#include "functions.h"

NODE* findNode(const NODE** pointerToRoot, const int data) {

	if ((*pointerToRoot) == NULL) {
		printf("0x06378: Empty Tree! or Not Found!");
		exit(0);
	}
	else if ((*pointerToRoot)->data < data) {
		return findNode(&(*pointerToRoot)->right, data);
	}
	else if ((*pointerToRoot)->data > data) {
		return findNode(&(*pointerToRoot)->left, data);
	}
	else {
		//(*pointerToRoot)->data = data
		return pointerToRoot;
	}
	
}

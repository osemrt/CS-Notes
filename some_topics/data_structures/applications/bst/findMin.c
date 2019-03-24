#include "functions.h"

NODE* findMin(const NODE** pointerToRoot) {

	if ((*pointerToRoot) == NULL) {
		printf("0x5612: Empty Tree! or Not Found!");
		exit(0);
	}
	else if ((*pointerToRoot)->left == NULL) {
		return pointerToRoot;
	}
	else {
		return findMin(&(*pointerToRoot)->left);
	}







}

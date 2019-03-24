#include "functions.h"

NODE* findMax(const NODE** pointerToRoot) {

	if ((*pointerToRoot) == NULL) {
		printf("0xA12C: Empty Tree! or Not Found!");
		exit(0);
	}
	else if ((*pointerToRoot)->right == NULL) {
		return pointerToRoot;
	}
	else {
		return findMax(&(*pointerToRoot)->right);
	}


}
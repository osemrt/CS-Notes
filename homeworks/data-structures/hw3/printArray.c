#include "header_files/declarations.h"

/**
*	Prints the given array
*	@param int arr[] a collection of the elements
*	@param int size the number of elements in the array
*/

void printArray(int arr[], int size) {
	int i;

	printf("\n[ ");
	if (arr != NULL) {
		for (i = 0; i < size; i++) {
			printf("%d ", arr[i]);
		}
	}
	printf("]\n");

}
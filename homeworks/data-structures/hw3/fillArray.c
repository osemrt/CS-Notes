#include "header_files/declarations.h"

/**
*	Fills the given array with numbers in the range 1 to size sequentially
*	@param int arr[] a collection of the elements
*	@param int size the number of elements in the array
*	@return the address of the filled array
*/


int* fillArray(int arr[], int size) {
	int i;

	for (i = 0; i < size; i++) {
		arr[i] = i + 1;
	}

	return arr;
}
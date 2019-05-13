#include "header_files/declarations.h"

/**
*	Shuffles an array by just swapping random elements in the array
*	@param int arr[] a collection of the elements
*	@param int size the number of elements in the array
*	@return the address of the shuffled array
*/

int* shuffleArray(int arr[], int size) {

	int i, j;
	for (i = size - 1; i > 0; i--) {
		j = rand() % (i + 1);
		swap(arr, i, j);
	}

	return arr;

}
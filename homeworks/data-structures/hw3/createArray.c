#include "header_files/declarations.h"

/**
*	Creates an array with the given size
*	@param int size an integer for the array size
*	@return the address of the created array or NULL when the creating fails
*/

int* createArray(int size) {
	int* arr = (int*)malloc(sizeof(int) * size);
	return arr;
}
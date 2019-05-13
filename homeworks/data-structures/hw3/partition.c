#include "header_files/declarations.h"

/**
*	Takes a pivot and collects the elements that are bigger than pivot 
*	to the right-hand, and all smaller to the left-hand side
*	@param int arr[]	a collection of the elements
*	@param int first	the starting point of the given interval
*	@param int last	the end point of the given interval
*	@param int pivot	the pivot value		
*	@return int	  the index of the last position of the pivot
*/

int partition(int arr[], int first, int last, int pivot) {

	while (first < last) {
		while (first < last && arr[first] < pivot) {
			first++;
		}

		while (first<last && arr[last]>pivot) {
			last--;
		}

		swap(arr, first, last);
	}

	return first;

}
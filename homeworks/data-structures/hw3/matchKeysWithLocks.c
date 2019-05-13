#include "header_files/declarations.h"

/**
*	Matches all locks with the proper keys by picking a random key at each time
*	@param int key[]	a key array consists of integers
*	@param int lock[]	a lock array consists of integers
*	@param int first	the starting point of the given arrays 
*	@param int last		the end point of the given arrays
*
*/


void matchKeysWithLocks(int key[], int lock[], int first, int last) {

	if (last > first) {

		//getting a random key index
		int keyIndex = first + rand() % (last - first + 1);

		int pivotIndexInLockArray = partition(lock, first, last, key[keyIndex]);
		int pivotIndexInKeyArray = partition(key, first, last, lock[pivotIndexInLockArray]);

		matchKeysWithLocks(key, lock, first, pivotIndexInKeyArray - 1);
		matchKeysWithLocks(key, lock, pivotIndexInKeyArray + 1, last);

	}


}
#include "header_files/declarations.h"

int main() {

	//Getting a random number for array sizes
	srand(time(NULL));
	int N = rand() % MAX_SIZE;

	//Creating the arrays
	int* lock = createArray(N);
	int* key = createArray(N);

	//Filling the arrays
	fillArray(lock, N);
	fillArray(key, N);

	//Shuffling the arrays
	shuffleArray(lock, N);
	shuffleArray(key, N);

	//Printing the first state of the arrays
	printf("\n-------------------Initial state-------------------\n\n");
	printf("Lock array:");
	printArray(lock, N);
	printf("\nKey array:");
	printArray(key, N);


	matchKeysWithLocks(key, lock, 0, N - 1);

	//Printing the last state of the arrays
	printf("\n\n-------------------Last state-------------------\n\n");
	printf("Lock array:");
	printArray(lock, N);
	printf("\nKey array:");
	printArray(key, N);


	return 0;
}


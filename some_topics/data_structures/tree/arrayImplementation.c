#include "functions.h"

#define VAL_1X   INT_MIN
#define VAL_2X   VAL_1X,  VAL_1X
#define VAL_4X   VAL_2X,  VAL_2X
#define VAL_8X   VAL_4X,  VAL_4X
#define VAL_16X  VAL_8X,  VAL_8X
#define VAL_32X  VAL_16X, VAL_16X
#define VAL_64X  VAL_32X, VAL_32X

/*

	in a complete binary tree for node at index i,
	skip i=0!, root is stored at index 1.
	parent index = floor(i/2)
	left-child index = 2 * i
	right-child index = 2 * i + 1
	
	._0_. _1_. _2_. _3_. _4_. _5_. _6_. _7_. _8_. 
	|___||___||___||___||___||___||___||___||___|
	
	used for heap ?
*/


int A[MAX_SIZE] = { VAL_8X, VAL_8X, VAL_4X };


void insertArray(int data, int index) {
	if (index > MAX_SIZE) {
		printf("No space available in the array!");
	}
	else if (A[index] == INT_MIN) {
		A[index] = data;
	}
	else if (data > A[index]) {
		insertArray(data, 2 * index + 1);
	}
	else {
		insertArray(data, 2 * index);
	}

}

void printArray() {
	for (int i = 1; i < MAX_SIZE; i++) {
		if (A[i] != INT_MIN) {
			printf("%d : ", A[i]);
		}
		
	}
}
#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int main() {

	srand(time(NULL));

	int i, j, k;

	int N = rand() % 15 + 1;

	int** W = (int**)malloc(N*sizeof(int));
	for (i = 0; i < N; i++)
		W[i] = (int*)malloc(N * sizeof(int));

	for (i = 0; i < N; i++) {
		for (j = 0; j < N; j++)
			W[i][j] = rand() % 2;
	}

	for (i = 0; i < N; i++) {
		for (j = 0; j< N; j++)
			printf(" %d", W[i][j]);
		printf("\n");
	}

	for (i = 0; i < N; i++)
		for (j = 0; j < N; j++)
			for (k = 0; k < N; k++)
				W[i][j] = W[i][j] || (W[i][k] && W[k][j]);
	
	printf("\n\n");

	for (i = 0; i < N; i++) {
		for (j = 0; j < N; j++)
			printf(" %d", W[i][j]);
		printf("\n");
	}

	return 0;
}

/********************************************************************************************************************************************
| - Realloc deallocates the old object pointed to by ptr and returns a pointer to a new object that has the size specified by size. 
| - Realloc() should only be used for dynamically allocated memory. If the memory is not dynamically allocated, then behavior is undefined.
*********************************************************************************************************************************************/

#include <stdio.h>
#include <stdlib.h>


void printMatrix(int**, int, int);
void fillMatrix(int**, int, int);

int main() {

	int i, j, row = 4, column = 5, newRow = 6, newColumn = 7;

	// Initial allocation
	int** matrix = malloc(row * sizeof(int*));
	for (i = 0; i < row; i++)
		matrix[i] = malloc(column * sizeof(int));

	fillMatrix(matrix, row, column);
	printMatrix(matrix, row, column);


	// Let's add some row and some column
	matrix = realloc(matrix, newRow * sizeof(int*));
	for (i = 0; i < row; i++)
		matrix[i] = realloc(matrix[i], newColumn * sizeof(int));

	for (i = row; i < newRow; i++)
		matrix[i] = malloc(sizeof(int)* newColumn);

	printMatrix(matrix, newRow, newColumn);	

	//Here comes the free
	for (i = 0; i < newRow; i++)
		free(matrix[i]);
	free(matrix);

	return 0;
}

void fillMatrix(int** matrix, int row, int column) {

	int i, j;

	for (i = 0; i < row; i++)
		for (j = 0; j < column; j++)
			matrix[i][j] = i + j;


}

void printMatrix(int** matrix, int row, int column) {

	int i, j;

	for (i = 0; i < row; i++) {
		for (j = 0; j < column; j++)
			printf("%20d", matrix[i][j]);

		printf("\n");
	}

	printf("\n\n");
}

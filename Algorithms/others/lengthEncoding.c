#include <stdio.h>
#include <stdlib.h> // to use the memory functions


void runLengthEncoding(int, void(*)(), void(*)(), int**, int, int);
void columnScan(int**, int , int , int*);
void lineScan(int**, int , int , int* );


int main() {

	srand(time(NULL)); // to get the different random numbers
	
	int row_size, column_size;
	int i, j, pref;

	//take the inputs from the user
	printf("Enter the row size of your matrix    : ");
	scanf("%d", &row_size);

	printf("Enter the column size of your matrix : ");
	scanf("%d", &column_size);

	printf("-----------------------------");

	printf("\nWell. Select your preference to compare the matrix!\n");
	printf("\n0) Line Scan");
	printf("\n1) Column Scan\n\n-> ");
	scanf("%d", &pref);
	printf("\n");
	//////////////////////////////

	//matrix operations
	int** matrix = (int**)malloc(row_size * sizeof(int*));
	for (i = 0; i < column_size; i++)
		matrix[i] = (int*)malloc(column_size * sizeof(int*));

	for (i = 0; i < row_size; i++) 
		for (j = 0; j < column_size; j++)
			matrix[i][j] = rand() & 5 + 1;
	
	printf("A random matrix before the encoding\n\n");
	for (i = 0; i < row_size; i++) { //print matrix before the encoding
		for (j = 0; j < column_size; j++)
			printf("%2d ", matrix[i][j]);
		printf("\n");
	}
	printf("\n");
	//////////////////
	
	runLengthEncoding(pref, lineScan, columnScan, matrix, row_size, column_size);
	   

	scanf("\n"); //to hold the console on the screen
	return 0;
}

void runLengthEncoding(int pref, void(*lScan)(), void(*cScan)(), int** matrix, int row_size, int column_size){

	//scannedArray will store elements of matrix after the scan
	int* scannedArray = (int*)malloc(row_size*column_size * sizeof(int));
	
	if (pref)
		cScan(matrix, row_size, column_size, scannedArray);
	else
		lScan(matrix, row_size, column_size, scannedArray);

	int* compressedArray = NULL;

	int count; //to store the amount of the repeated numbers
	int i = 0; //it shows the index of the scannedArray
	int j = 0; //it shows the index of the compressedArray
	int controlRealloc = 0; //to resize of the compressedArray

	int length = row_size * column_size; // length of the scannedArray

	while (i<length) {
		
		count = 1;
		while ((scannedArray[i] == scannedArray[i + 1]) && i < length - 1){
			count++; i++;
		}

		controlRealloc += 2;
		compressedArray = realloc(compressedArray, sizeof(int)*controlRealloc);
		

		compressedArray[j] = count; 
		compressedArray[j + 1] = scannedArray[i];

		j = j+2; i++;
	}

	printf("The Compressed Array\n\n");
	for (i = 0; i < j; i++)
		printf("%2d", compressedArray[i]);

	printf("\n\n");

	
	float compressionRatio = 1 - (float)length / j; //it is same with (j-length)/j 
	printf("The Compression Ratio : %.2f", compressionRatio);

}

void lineScan(int**matrix, int row_size, int column_size, int* scannedArray) {
	int i, j;
	int control = 1;

	for (i = 0; i < row_size; i++) {
		for (j = 0; j < column_size; j++) {
			if (control)
				scannedArray[i*column_size + j] = matrix[i][j];
			else
				scannedArray[i*column_size + j] = matrix[i][(column_size-1)-j];			
		}

		control = !control;
	}

	printf("The Scanned Array\n\n");
	for (i = 0; i < row_size*column_size; i++)
		printf("%2d", scannedArray[i]);
	printf("\n\n");

}

void columnScan(int**matrix, int row_size, int column_size, int*scannedArray){
	int i, j;
	int control = 0;
	
	for (j = 0; j < column_size; j++) {
		for (i = 0; i < row_size; i++) {
			if (control)
				scannedArray[j*row_size + i] = matrix[(row_size - 1) - i][j];
			else
				scannedArray[j*row_size + i] = matrix[i][j];
		}

		control = !control;
	}

	printf("The Scanned Array\n\n");
	for (i = 0; i < row_size*column_size; i++)
		printf("%2d", scannedArray[i]);
	printf("\n\n");

}


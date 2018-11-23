#include <stdio.h>
#define MAX_SIZE 100


int Xpower(int x, int p);
void convertToBinary(int *B, int i, int arr_count);

int main() {

	
	int i,j; //some declarations

	//get the inputs from the user
	int arr_count;
	printf("Enter a size for your array: ");
	scanf("%d", &arr_count);

	printf("\n");

	char arr[MAX_SIZE];
	printf("Now enter the elements of the array\n");
	printf("===================================\n");
	for (i = 0; i < arr_count; i++) {
		printf("%d-element: ", i + 1);
		scanf(" %c", &arr[i]);
	}
	///////////////////////////

	int limit = Xpower(2, arr_count); //to get "2^arr_count"
	
	//other things in the code
	printf("\n P(S) = { {}"); 
	for (i = 1; i < limit; i++) {
		
		int B[MAX_SIZE] = { 0 };

		convertToBinary(B, i, arr_count);
		printf(" ,");
		for (j = 0; j < arr_count; j++) {
			if (B[j] == 1) {
				printf("%c", arr[j]);
			}

		}
				
	}

	printf(" }");
	//////////////////////////

	int Q;
	scanf("%d", &Q); // to stop the console

	return 0;
}


int Xpower(int x, int p) {
	int T, k;

	if (p == 0) {
		T = 1;
	}
	else {
		k = Xpower(x, p / 2);

		if (p % 2 == 1) {
			T = k * k * x;
		}
		else {
			T = k * k;
		}
	}

	return T;
}

void convertToBinary(int *B, int i, int arr_count) {

	for (int j = arr_count - 1; j >= 0; j--) {
		B[j] = i % 2;
		i = i / 2;
	}
		
}

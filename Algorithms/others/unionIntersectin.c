#include <stdio.h>
#include <stdlib.h> // to use malloc

int main() {

	srand(time(NULL)); //prevents from generating same number for rand function

	//some declarations
	int i, j, k, p1, p2;
	short int C1[127] = { 0 };
	short int C2[127] = { 0 };
	///////////////////
	
	//create two random arrays with random sizes
	int m = (rand() % 20); 
	int n = (rand() % 20); 

	char *A = malloc(m * sizeof(char));
	char *B = malloc(n * sizeof(char));

	for (i = 0; i < m; i++) {
		k = rand() % 80 + 48;
		*(A + i) = k;
		C1[k] = 1;
		
	}

	for (i = 0; i < n; i++) {
		k = rand() % 80 + 48;
		*(B + i) = k;
		C2[k] = 1;
	}
	////////////////////////////////////////////

	printf("What does this program do for you?\n1)Union\n2)Intersection\n\n");
	scanf("%d", &p1);
	printf("\n\n");

	//print the arrays before the process
	for (i = 0; i < m; i++) {
		printf("%c ", *(A + i));
	}
	printf("\n-------------\n");
	for (i = 0; i < n; i++) {
		printf("%c ", *(B + i));
	}
	printf("\n\n");
	/////////////////////////////////////////

	
	if (p1 == 1) {
		for (i = 0; i < 128; i++) {
			if (C1[i] + C2[i] >= 1) {
				printf("%c, ", i);
			}
		}
	}
	else if(p1==2){
		for (i = 0; i < 128; i++) {
			if (C1[i] * C2[i] == 1) {
				printf("%c ", i);
			}
		}
	}
	else {
		printf("Please enter a valid input!");
	}
		
	return 0;
}

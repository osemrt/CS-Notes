#include <stdio.h>
#include <stdlib.h>

int main()
{
	int n,i, j, k;
	scanf("%d", &n);
	int t = n;

	int A[200][200] = {0};
	k = 0;
	while (n > 0) {
		for (i = k; i < 2*n - 1+k; i++) {
			for (j = k; j < 2*n - 1+k; j++) {
				A[i][j] = n;
			}
		}
		n--; k++;
	}

	for (i = 0; i < 2*t - 1; i++) {
		for (j = 0; j < 2 * t - 1; j++) {
			printf("%d ", A[i][j]);
		}
		printf("\n");
	}
	
	scanf("\n");

	return 0;
}

#include <stdio.h>
#include <stdlib.h>

int mul(int, int);
int func1(int, int);
int func2(int, int);
int generateNum();


int main() {

	srand(time(NULL));

	int x = generateNum();
	int y = generateNum();

	printf("%6d   *%6d   = %6d | %6d\n", x, y, mul(x, y), x*y);

	return 0;
}

int mul(int a, int b) {


	if (a == 0 | b == 0) {
		return 0;
	}

	if (b > 0) {
		return func1(a, b);
	}

	if (b < 0) {
		return -1 * func2(a, b);
	}

}

int func1(int a, int b) {

	if (b > 1) {
		b--;
		return a + func1(a, b);

	}

	return a;

}

int func2(int a, int b) {

	if (b < -1) {
		b++;
		return a + func2(a, b);

	}

	return a;

}

int generateNum() {

	return rand() % 100 - 50;

}

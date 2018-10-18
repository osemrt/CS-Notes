#include <stdio.h>

int main() {

	int hour, minute, second, temp;

	printf("Enter a hour (HH:MM:SS): ");
	scanf("%d:%d:%d", &hour, &minute, &second);

	int total_seconds = hour * 3600 + minute * 60 + second;

	while (1) {
		temp = total_seconds;
		hour = (temp / 3600) % 24;
		printf("%d:", hour);
		minute = (temp - hour * 3600) / 60;
		printf("%d:", minute);
		second = total_seconds % 60;
		printf("%d", second);

		total_seconds++;


		printf("\n");
	}

}

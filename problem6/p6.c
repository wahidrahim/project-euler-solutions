#include <stdio.h>

int sumSquares(int n) {
	int sum = 0;
	for(int i = 1; i <= n; i++) {
		sum += i*i;
	}
	return sum;
}

int squareSums(int n) {
	int sum = 0;
	for(int i = 1; i <= n; i++) {
		sum += i;
	}
	return sum*sum;
}

int main() {
	printf("%d\n", squareSums(100) - sumSquares(100));
	return 0;
}

#include <stdio.h>
#include <stdbool.h>
#include <math.h>
/*
 * returns true iff n is a prime else false
 */
bool isPrime(int n) {
	for(int i = 2; i <= sqrt(n); i++) {
		if(n % i == 0) {
			return false;
		}
	}
	return true;
}

/*
 * returns the nth prime
 */
int prime(int n) {
	if(n < 3) {
		return (n == 1)? 2 : 3;
	} else {
		int p = 2, nthPrime;
		for(int i = 4; p < n; i++) {
			if(isPrime(i)) {
				nthPrime = i;
				p++;
			}
		}
		return nthPrime;
	}
}

int main() {
	printf("%d\n", prime(10001));
	return 0;
}

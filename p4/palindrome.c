#include <stdbool.h>

int digits(int n)
{
	int digs = 1;
	int tens = 10;

	while(n % tens < n) {
		digs++;
		tens *= 10;
	}

	return digs;
}

// exponent(a, b) returns a raised to the power of b (a^b)
// PRE: a > 0 and b >= 0
// POST: returns an integer > 0
int exponent(int a, int b)
{
	if (b == 0) return 1;

	int product = a;

	while(b > 1) {
		product *= a;
		b--;
	}
	
	return product;
}

// is_palindrome(int n) returns true if n is a palindrome number, false otherwise.
// PRE: 0 <= n <= 999999999
// POST: true or false
bool is_palindrome(int n)
{
	int digs = digits(n);

	int reversed_num = 0;
	int tens = 10;

	for(int i = 1; i <= digs; i++) {
		reversed_num += ((n % tens) / (tens/10)) * (exponent(10, digs - i));
		tens *= 10;
	}	

	return (n == reversed_num);
}


#include <stdio.h>

int charInteger(char c) { return c - '0'; }

int main() {
	FILE *number_file = fopen("number.txt", "r");
	unsigned long long max_product = 1, temp_product;
	int product_terms = 13;
	char c;

	for(int i = 0; i <= 1000 - product_terms; i++) {
		temp_product = 1;
		fseek(number_file, i, SEEK_SET);
		c = fgetc(number_file);

		for(int j = i; j < product_terms + i; j++) {
			if(c == '0') {
				i = j;
				break;
			}
			temp_product *= charInteger(c);
			c = fgetc(number_file);
		}

		if(temp_product > max_product) max_product = temp_product;
	}

	printf("%llu\n", max_product);
	fclose(number_file);
	return 0;
}

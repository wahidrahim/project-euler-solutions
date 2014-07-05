#include <stdio.h>

int main() {
	FILE *number_file = fopen("number.txt", "r");
	char c = fgetc(number_file);

	for(int i = '0'; i <= '9'; i++) {
		while(c != EOF) {
			if(c == i || c == '\n') {
				printf("%c", c);
			} else {
				printf(" ");
			}
			c = fgetc(number_file);
		}
		printf("\n");
		rewind(number_file);
		c = fgetc(number_file);
	}

	fclose(number_file);
	return 0;
}

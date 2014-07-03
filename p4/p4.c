#include <stdio.h>
#include "palindrome.h"

int p4()
{
	int max = 0;
	for(int i = 999; i > 99; i--) 
		for(int j = 999; j > 99; j--) 
			if(is_palindrome(i*j)) 
				max = (max < i*j)? i*j : max;
	return max;
}

int main()
{
	printf("%d\n", p4());
	return 0;
}

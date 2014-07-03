#include <stdio.h>
#include <stdbool.h>

bool divisible(int n)
{
	for(int i = 2; i <= 20; i++)
		if(n % i != 0)
			return false;
	return true;
}

int main()
{
	int n = 20;

	while(!divisible(++n));

	printf("%d\n", n);
	
	return 0;
}

#include <stdio.h>

int main()
{
	int t1 = 1, t2 = 2, t3 = t1 + t2, sum = 2;

	while(t3 <= 4000000) {
		if(t3 % 2 == 0)
			sum += t3;
		t1 = t2;
		t2 = t3;
		t3 = t1 + t2;
	}

	printf("%d\n", sum);

	return 0;
}

/* Problem 14
 *
 * http://projecteuler.net/problem=14
 */

final class P14 {
	static long nextTerm(long n) {
		if (n % 2 == 0) {
			return n / 2;
		} else {
			return (3 * n) + 1;
		}
	}

	public static void main(String[] args) {	
		int max = 0;
		long maxTerm = 0;

		for (long start = 999999; start > 1; --start) {
			int count = 1;
			for (long n = start; n != 1; ++count) {
				n = nextTerm(n);
			}

			if (count > max) {
				max = count;
				maxTerm = start;
			}
		}

		System.out.println(maxTerm);
	}
}

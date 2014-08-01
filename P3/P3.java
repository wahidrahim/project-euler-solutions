/* Problem 3
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143?
 */

final class P3 {
	private static boolean isPrime(final long N) {
		final long ROOT = (long) Math.sqrt(N);

		for (long i = 2; i <= ROOT; i++) {
			if (N % i == 0) return false;
		}
		return true;
	}

	public static void main (String[] args) {
		final long NUM = 600851475143L;
		final long NUMROOT = (long) Math.sqrt(NUM);
		long max = 0;

		for (long i = 2; i <= NUMROOT; i++) {
			if (NUM % i == 0 && isPrime(i) && max < i) max = i;
		}
		System.out.println(max);
	}
}

/* Problem 7
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */

final class P7 {
	static boolean isPrime(int n) {
		int root = (int) Math.sqrt(n);
		for (int i = 2; i <= root; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int nth_prime = 10001;
		int p = 1;

		do {
			p++;
			if (isPrime(p)) nth_prime--;
		} while (nth_prime > 0);

		System.out.println(p);
	}
}

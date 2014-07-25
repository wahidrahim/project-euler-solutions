final class P10 {
	static boolean isPrime(final int n) {
		final int ROOT = (int) Math.sqrt(n);

		for (int i = 2; i <= ROOT; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		final int SUM_BELOW = 2000000;
		long sum = 0;

		for (int i = 2; i < SUM_BELOW; i++) {
			if (isPrime(i)) sum += i;
		}

		System.out.println(sum);
	}
}

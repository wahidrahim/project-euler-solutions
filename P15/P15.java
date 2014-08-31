final class P15 {
	public static void main(String[] args) {
		int n = 20;
		int sum = n + 1;

		for (int i = n-1; i > 1; i--) {
			sum += i * (n-1);
		}


		System.out.println(sum * 2);
	}
}

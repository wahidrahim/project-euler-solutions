class p4 {
	public static boolean is_palindrome(int n) {
		StringBuilder strn = new StringBuilder(Integer.toString(n));
		int r = Integer.parseInt(strn.reverse().toString());
		return n == r;
	}

	public static int p4_solution()
	{
		int max = 0;
		for(int i = 999; i > 99; i--)
			for(int j = 999; j > 99; j--)
				if(is_palindrome(i*j))
					max = (max < i*j)? i*j : max;
		return max;
	}

	public static void main(String[] args) {
		System.out.println(p4_solution());
	}
}

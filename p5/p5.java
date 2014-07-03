class p5 {
	public static boolean divisible(int n) {
		for(int i = 2; i <= 20; i++)
			if(n % i != 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		int n = 20;
		while(!divisible(++n));
		
		System.out.println(n);
	}
}

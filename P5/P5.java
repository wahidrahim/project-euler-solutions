/* Problem 5
 *
 * 2520 is the smallest number that can be divided by 
 * each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly 
 * divisible by all of the numbers from 1 to 20?
 */

final class P5 {
	private static boolean divisible(int n) {
		for(int i = 2; i <= 20; i++) {
			if(n % i != 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 20;

		while(!divisible(++n));
		System.out.println(n);
	}
}

/* Problem 4
 *
 * A palindromic number reads the same both ways. The largest palindrome made from 
 * the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

final class P4 {
	private static boolean is_palindrome(int n) {
		StringBuilder strn = new StringBuilder(Integer.toString(n));
		int r = Integer.parseInt(strn.reverse().toString());

		return n == r;
	}

	public static void main(String[] args) {
		int max = 0;

		for(int i = 999; i > 99; i--) {
			for(int j = 999; j > 99; j--) {
				if(is_palindrome(i*j) && max < i*j) max = i*j;
			}
		}
		System.out.println(max);
	}
}

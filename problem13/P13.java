/* Problem 13
 *
 * http://projecteuler.net/problem=13
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

final class P13 {
	public static void main(String[] args) throws IOException {
		BufferedReader numReader = null;
		BigInteger sum = null;

		try {
			numReader = new BufferedReader(new FileReader("numberlist.txt"));
			sum = new BigInteger("0");
			String num = numReader.readLine();

			while (num != null) {
				sum = sum.add(new BigInteger(num));
				num = numReader.readLine();
			}
			
		} finally {
			numReader.close();
		}

		System.out.println(sum.toString().substring(0, 10));
	}
}

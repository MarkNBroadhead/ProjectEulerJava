package problems;

/**
 * This class solves Problem 4 from ProjectEuler.net
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author Mark N Broadhead
 * @version 14/5/2014
 * 
 */

public class Problem004 {
	// the largest product of 2x 3 digit numbers, (999x999) is 998001
	// we start here test each number to see if it is the sum of two 3 digit factors.
	public static void main(String[] args) {
		for ( int i = 998001; i > 10000; i--) {
			if ( isPalindrome(i) ) { 
				// test one 3 digit factor
				for ( int j = 999; j >= 100; j--)
					// check to make sure the other factor is whole and 3 digits as well.
					if (i % j == 0 && i / j >= 100 && i/j < 1000) {
						System.out.println( j + " and " + (i / j) + " are the products for " + i);
							// exit after we find the largest palindrome with two 3 digit factors
							System.exit(1);   
				}
			}
		}
	}	
	
	/**
	 * 
	 * @param num is tested to see if it is a palindrome
	 * @return true if num is a palindrome
	 */
	public static boolean isPalindrome(int num) {
		char [] numArr = String.valueOf(num).toCharArray();
		int length = numArr.length;
		for ( int i = 0; i < (length); i++ ) {
			if ( numArr[i] != numArr[length - i - 1] ) {
				return false;
			}
		}
		return true;
	}
}
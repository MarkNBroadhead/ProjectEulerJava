package problems;

import java.util.*;
/**
 * This class solves Problem 2 from ProjectEuler.net
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
 * find the sum of the even-valued terms.
 * 
 * @author Mark N Broadhead
 * @version 5/4/2014
 */

public class Problem002 {

	private static final int MAX = 4000000;

	public static void main(String[] args) {
		System.out.println(fibGen(MAX).toString());
		System.out.println("The sum of all even Fibonacci numbers under " + MAX + " is: " + addEvens(fibGen(MAX)) );
	}

	/**
	 * 
	 * @param MAX
	 * @return an ArrayList containing all the Fibonacci numbers up to MAX
	 */
	public static List<Integer> fibGen(int MAX) {
		ArrayList<Integer> fibList = new ArrayList<Integer>();
		// Fibonacci number n is n = (n-1) + (n-2)
		int n1 = 0;
		int n2 = 1;
		while (n2 < MAX) {
			fibList.add(n2);
			int temp = n1+n2;
			n1 = n2;
			n2 = temp;
		}
		return fibList;
	}

	/**
	 * 
	 * @param l a List of numbers
	 * @return the sum of the even numbers in the list
	 */
	public static long addEvens(List<Integer> l) {
		long total = 0;
		for (Integer i : l) {
			if (i%2 == 0) {
				total += i;
			}
		}
		return total;
	}
}

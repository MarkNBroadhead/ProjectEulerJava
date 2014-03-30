/**
 * 
 */
package problems;

import java.util.*;

/**
 * This class solves Problem 1 from ProjectEuler.net
 * @author Mark N Broadhead
 * @version 29/3/2014
 * 
 */
public class Problem001 {

	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		// for 3, 5, 16, the answer is 60
		
		Integer number1 = 3;
		Integer number2 = 5;
		Integer limit = 1000;

		int sum1 = algorithm1(number1, number2, limit);

		System.out.println();
		System.out.println("The sum of the multiples of " + number1 + " and " + number2 + " is: " + sum1);

		long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
	}
	
	/**
	 * 
	 * @param number1 One multiple to calculate
	 * @param number2 Second multiple to calculate
	 * @param limit Calculate all multiples up to this number
	 * @return The sum of all multiples of number1 and number2 up to limit
	 */
		public static int algorithm1(int number1, int number2, int limit){
		// populate a list with all the multiples of number1 up to limit
		List<Integer> jointList = new ArrayList<Integer>(multiples(number1, limit));
		// populate a second list with multiples of number2 up to limit
		List<Integer> listTwo = multiples(number2, limit);
		// add items from listTwo that are not already in JointList.
		for (Integer i : listTwo){
			if (!jointList.contains(i)) {
				jointList.add(i);
			}
		}
		// sum all of the entries in jointList and print a descriptive message
		int sum = 0;
		for (Integer i : jointList) {
			sum += i;
		}
		return sum;
	}
	
	/**
	 * 
	 * @param seed calculate the multiples of this number
	 * @param limit will calculate all multiples up to this point
	 * @return a list of all the multiples of seed up to the limit
	 */
	public static List<Integer> multiples(Integer seed, Integer limit) {
		List<Integer> a = new ArrayList<Integer>();
		for ( int i = 0; seed * i < limit; i++) {
			a.add(seed * i);
		}
		return a;
	}
}
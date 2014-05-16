package problems;
/**
 * This class solves Problem 5 from ProjectEuler.net
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?.
 * 
 * @author Mark N Broadhead
 * @version 15/5/2014
 */
public class Problem005 {
	private static int limit = 20;
	public static void main(String[] args) {
		boolean finished = false;
		for (int i = limit+1; finished != true ; i++) {
			if (isDivisible(i) == true) {
				System.out.println("The number " + i + " is divisible by 1-" + limit);
				finished = true;;
			}
		}
		System.out.println("program finished");
	}
	
	/***
	 * 
	 * @param value is tested against 1 through limit for divisibility
	 * @return true if value is divisible by all the numbers 1-limit
	 */
	public static boolean isDivisible(int value) {
		for ( int i = 1; i <= limit; i++) {
			if (value%i != 0 ) {
				return false;
			}
		}
		return true;
	}
}

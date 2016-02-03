package com.test;

import com.test.cmn.UserInputViaConsole;

/*
 * This Program will check if number is Even or Odd.
 * @author ank
 */

public class CheckEvenOddNum {

	private static int number;

	/**
	 * * This method is used to check that given no is even or odd.
	 * 
	 *   @param  Number to be evaluated
	 *   @return boolean flag
	 */
	private boolean isEvenOrOdd(int n) throws Exception {

		boolean isEvenOdd = (n >= 0 && n % 2 == 0) ? true : false;
		if (isEvenOdd) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}

		return isEvenOdd;

		// Optional Working Code
		/*
		 * if (n >= 0 && n % 2 == 0) {
		 *  System.out.println("Given number is Even"); 
		 * return true; 
		 * } 
		 * else { 
		 * System.out.println("Given number is Odd");
		 * return false; 
		 * }
		 */

	}

	public static void main(String[] args) {
		UserInputViaConsole ui = new UserInputViaConsole();
		try {
			number = ui.userInput(number);
			CheckEvenOddNum c = new CheckEvenOddNum();
			c.isEvenOrOdd(number);
		} catch (Exception e) {
			System.out.println("Exception caught : Rerun the program, Number not entered properly \n" + e);
		}
	}

}

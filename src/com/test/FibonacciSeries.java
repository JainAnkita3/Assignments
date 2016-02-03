package com.test;

import com.test.cmn.UserInputViaConsole;

/**
 * * This program is used to print Fibonacci series. *
 * 
 * @author ank
 */

public class FibonacciSeries {

	private static int num;

	/**
	 * * This method is used to print Fibonacci series. 
	 *   Fn = F{n-1} + F{n-2}
	 * 
	 * @param Num
	 */
	private static void generateFibonacci(int num) {
		int f1, f2 = 0, f3 = 1;
		System.out.println("Fibonacci sequence for first " + num + " fibonacci numbers :");
		for (int i = 1; i <= num; i++) {
			System.out.println(f3);
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
		}
	}

	public static void main(String args[]) {
		UserInputViaConsole ui = new UserInputViaConsole();
		try {
			System.out.println("Provide the 'n' for Fibonacci sequence");
			num = ui.userInput(num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (num > 0) {
			generateFibonacci(num);
		} else {
			System.out.println("No. should be greater than zero.");
		}
	}
}

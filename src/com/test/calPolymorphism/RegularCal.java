package com.test.calPolymorphism;

/**
 * This Program will have Regular Calculator & its operations.
 * 
 * @author ank
 *
 */

public class RegularCal implements Calculator {

	private int result;

	/**
	 * This will perform Sum of 2 numbers
	 * 
	 * @param a
	 *            value
	 * @param b
	 *            value
	 * @return
	 */
	@Override
	public int sum(int a, int b) {
		result = (a + b);
		System.out.println("\nSum of " + a + " & " + b + " is = " + result);
		return result;
	}

	public int sum(int a, int b, int c) {
		result = (a + b + c);
		System.out.println("\nSum of 3 number is = " + result);
		return result;
	}

	public int sum(int a, int b, int c, int d) {
		result = (a + b + c + d);
		System.out.println("Sum of 4 number is = " + result);
		return result;
	}

	public int sum(int a, int b, int c, int d, int e) {
		result = (a + b + c + d + e);
		System.out.println("Sum of 5 number is = " + result);
		return result;
	}

	/**
	 * This will perform Difference of 2 numbers
	 * 
	 * @param a
	 *            value
	 * @param b
	 *            value
	 * @return
	 */
	@Override
	public int difference(int a, int b) {
		result = (a - b);
		System.out.println("Difference of " + a + " & " + b + " is = " + result);
		return result;
	}

	public int difference(int a, int b, int c) {
		result = (a - b - c);
		System.out.println("\nDifference  of 3 number is = " + result);
		return result;
	}

	public int difference(int a, int b, int c, int d) {
		result = (a - b - c - d);
		System.out.println("Difference of 4 number is = " + result);
		return result;
	}

	public int difference(int a, int b, int c, int d, int e) {
		result = (a - b - c - d - e);
		System.out.println("Difference of 5 number is = " + result);
		return result;
	}

	/**
	 * This will perform Product of 2 numbers
	 * 
	 * @param a
	 *            value
	 * @param b
	 *            value
	 * @return
	 */
	@Override
	public int product(int a, int b) {
		result = (a * b);
		System.out.println("Product of " + a + " & " + b + " is = " + result);
		return result;
	}

	public int product(int a, int b, int c) {
		result = (a * b * c);
		System.out.println("\nProduct of 3 number is = " + result);
		return result;
	}

	public int product(int a, int b, int c, int d) {
		result = (a * b * c * d);
		System.out.println("Product of 4 number is = " + result);
		return result;
	}

	public int product(int a, int b, int c, int d, int e) {
		result = (a * b * c * d * e);
		System.out.println("Product of 5 number is = " + result);
		return result;
	}

}

package com.test.calculator;

/**
 * Interface for Calculator.
 * 
 * @author ank
 *
 */

public interface Calculator {

	// Need to confirm with Vasanth which should be used.
	public final String battery = "AA";
	// public static final String battery = "AA";

	/**
	 * Abstract method for sum of 2 numbers
	 * 
	 * @param a
	 *            value
	 * @param b
	 *            value
	 * @return
	 */
	public abstract int sum(int a, int b);

	/**
	 * Abstract method for Difference of 2 numbers
	 * 
	 * @param a
	 *            value
	 * @param b
	 *            value
	 * @return
	 */
	public abstract int difference(int a, int b);

	/**
	 * Abstract method for Product of 2 numbers
	 * 
	 * @param a
	 *            value
	 * @param b
	 *            value
	 * @return
	 */
	public abstract int product(int a, int b);

}

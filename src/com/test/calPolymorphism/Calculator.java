package com.test.calPolymorphism;

/*
 * This Program will have Interface Calculator.
 * @author ank
 */

public interface Calculator {

	public static final String battery = "AA";

	/*
	 * This will calculate the Sum of 2 numbers.
	 */
	public abstract int sum(int a, int b);

	/*
	 * This will calculate the Difference of 2 numbers.
	 */
	public abstract int difference(int a, int b);

	/*
	 * This will calculate the Product of 2 numbers.
	 */
	public abstract int product(int a, int b);

}

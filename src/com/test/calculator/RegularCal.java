package com.test.calculator;

/*
 * This Program will have Regular Calculator.
 * @author ank
 */

public class RegularCal implements Calculator {

	private int result;

	@Override
	public int sum(int a, int b) {
		result = (a + b);
		System.out.println("Sum of " + a + " & " + b + " is = " + result);
		return result;
	}

	@Override
	public int difference(int a, int b) {
		result = (a - b);
		System.out.println("Difference of " + a + " & " + b + " is = " + result);
		return result;
	}

	@Override
	public int product(int a, int b) {
		result = (a * b);
		System.out.println("Product of " + a + " & " + b + " is = " + result);
		return result;
	}

}

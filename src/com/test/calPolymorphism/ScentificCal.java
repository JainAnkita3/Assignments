package com.test.calPolymorphism;

import java.util.ArrayList;
import java.util.List;

/*
 * This Program will have Scientific Calculator.
 * @author ank
 */

public class ScentificCal extends RegularCal implements Calculator {

	private int result;
	public List<String> numbers = new ArrayList<String>();

	/*
	 * This will calculate the Cube of a number.
	 */
	public int cube(int a) {
		result = (a * a * a);
		System.out.println("\nCube of " + a + " is = " + result);
		return result;

	}

	/*
	 * This will calculate the Square of a number.
	 */
	public int square(int a) {
		result = (a * a);
		System.out.println("\nSquare of " + a + " is = " + result);
		return result;

	}

}

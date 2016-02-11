package com.test.calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * This Program will have Scientific Calculator & its operations.
 * 
 * @author ank
 *
 */

public class ScientificCal extends RegularCal implements Calculator {

	private int result;
	public List<String> numbers = new ArrayList<String>();

	/**
	 * This will perform Cube of a number
	 * 
	 * @param a
	 *            value
	 * @return result
	 */
	public int cube(int a) {
		result = (a * a * a);
		System.out.println("\nCube of " + a + " is = " + result);
		return result;

	}

	/**
	 * This will perform Square of a number
	 * 
	 * @param a
	 *            value
	 * @return result
	 */
	public int square(int a) {
		result = (a * a);
		System.out.println("\nSquare of " + a + " is = " + result);
		return result;

	}

}

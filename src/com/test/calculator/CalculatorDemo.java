package com.test.calculator;

/*
 * This Program will have Main method for Calculator.
 * @author ank
 */

public class CalculatorDemo {

	public static void main(String[] args) {

		System.out.println("Calculator");

		/*
		 * UserInputViaConsole ui = new UserInputViaConsole();
		 * ui.InputViaConsole(ScentificCal.numbers);
		 */
		Calculator c = new RegularCal();
		c.sum(20, 30);
		c.difference(10, 5);
		c.product(15, 10);

		ScentificCal sc = new ScentificCal();
		sc.cube(10);
		sc.square(20);
	}

}

package com.test.calPolymorphism;

/*
 * This Program will have Main method for Calculator.
 * @author ank
 */

public class UseCalculator {

	public static void main(String[] args) {

		System.out.println("**  Calculator Using Polymorphism Concept  **");

		/*
		 * UserInputViaConsole ui = new UserInputViaConsole();
		 * ui.InputViaConsole(ScentificCal.numbers);
		 */
		Calculator c = new RegularCal();
		c.sum(20, 30);
		c.difference(10, 5);
		c.product(15, 10);

		RegularCal rc = new RegularCal();
		rc.sum(10, 2, 3);
		rc.sum(10, 2, 3, 4);
		rc.sum(10, 2, 3, 4, 5);
		rc.difference(100, 5, 5);
		rc.difference(100, 5, 5, 10);
		rc.difference(100, 5, 5, 10, 10);
		rc.product(15, 10, 10);
		rc.product(10, 10, 10, 10);
		rc.product(15, 10, 10, 10, 10);

		ScentificCal sc = new ScentificCal();
		sc.cube(10);
		sc.square(20);
	}

}

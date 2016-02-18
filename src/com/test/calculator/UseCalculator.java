package com.test.calculator;

/**
 * This Program will have Main method for Calculator.
 * 
 * @author ank
 *
 */
public class UseCalculator {

	private static ScannerStringOper sso;
	static boolean run = true;

	public UseCalculator() {
		System.out.println("Inside Constructor");
	}

	/**
	 * This method will instantiate the Calculator Program.
	 * 
	 * @param String
	 *
	 */
	public static void main(String[] args) {
		// boolean run = true;
		String input = null;
		UseCalculator uc = new UseCalculator();
		while (run) {
			System.out.println("\n ******  Welcome to Calculator  ****** \n ");
			System.out.println(
					" Press '1' for 'Scientific Calculator' \n Press '2' for 'Regular Calculator' \n Press '9' for 'Exit' \n");

			sso = new ScannerStringOper();
			input = sso.inputString(input, "");
			switch (input) {
			case "1":
				sso.callScentificCal();
				break;
			case "2":
				sso.callRegularCal();
				break;
			case "9":
				System.out.println("GoodBye");
				sso.inputString("", "Exit");
				run = false;
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}

	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out.println("**  Calculator Using Polymorphism Concept  **");
	 * 
	 * 
	 * UserInputViaConsole ui = new UserInputViaConsole();
	 * ui.InputViaConsole(ScentificCal.numbers);
	 * 
	 * Calculator c = new RegularCal(); c.sum(20, 30); c.difference(10, 5);
	 * c.product(15, 10);
	 * 
	 * RegularCal rc = new RegularCal(); rc.sum(10, 2, 3); rc.sum(10, 2, 3, 4);
	 * rc.sum(10, 2, 3, 4, 5); rc.difference(100, 5, 5); rc.difference(100, 5,
	 * 5, 10); rc.difference(100, 5, 5, 10, 10); rc.product(15, 10, 10);
	 * rc.product(10, 10, 10, 10); rc.product(15, 10, 10, 10, 10);
	 * 
	 * ScentificCal sc = new ScentificCal(); sc.cube(10); sc.square(20);
	 * 
	 * 
	 * }
	 */

}

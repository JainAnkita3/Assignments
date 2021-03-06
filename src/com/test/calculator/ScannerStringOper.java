package com.test.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class will take input from Console and perform operations accordingly.
 * 
 * Press 1 to SC
 * 
 * Press 2 to RC
 * 
 * Press 9 to Exit
 * 
 * @author ank
 *
 */

public class ScannerStringOper {

	private String in;
	private int result;
	private int value1;
	private int value2;
	private ScientificCal sci = new ScientificCal();
	private Scanner sc;

	/**
	 * This method takes the input from User
	 * 
	 * @param input
	 *            s User Input : Exit.
	 * @return String User Input value
	 */
	protected String inputString(String input, String s) {
		if (!s.equalsIgnoreCase("Exit")) {
			System.out.println("Enter value :\n");
			sc = new Scanner(System.in);
			while (sc.hasNext()) {
				input = sc.nextLine();
				if (input.equalsIgnoreCase("Exit")) {
					System.out.println("Closing Scanner resource");
					sc.close();
				}
				break;
			}
		} else {
			sc.close();
		}
		return input;
	}

	/**
	 * This method will give a call to Scientific Calculator Class
	 * 
	 */
	protected void callScentificCal() {
		// sso1 = new ScannerStringOper();
		System.out.println("Thank you for choosing Scentific Calculator");
		System.out.println("Now Choose Operation to perform on Scentific Calculator");
		System.out.println(
				" Press '1' for 'Sum' \n Press '2' for 'Product' \n Press '3' for 'Cube' \n Press '4' for 'Square' \n Press '9' for 'Exit'\n");
		in = inputString(in, "");
		switch (in) {
		case "1":
			handleSumScenario();
			break;
		case "2":
			handleProductScenario();
			break;
		case "3":
			handleCubeScenario();
			break;
		case "4":
			handleSquareScenario();
			break;
		case "9":
			handleExitScenario();
		default:
			System.out.println("Invalid Input");
			break;
		}

	}

	/**
	 * This method will give a call to Regular Calculator Class
	 * 
	 */
	protected void callRegularCal() {
		ScannerStringOper sso1 = new ScannerStringOper();
		System.out.println("Thank you for choosing Regular Calculator");
		System.out.println("Now Choose Operation to perform on Regular Calculator");
		System.out.println(" Press '1' for 'Sum' \n Press '2' for 'Product' \n Press '9' for 'Exit'\n");
		in = sso1.inputString(in, "");
		switch (in) {
		case "1":
			handleSumScenario();
			break;
		case "2":
			handleProductScenario();
			break;
		case "9":
			handleExitScenario();
		default:
			System.out.println("Invalid Input");
			break;
		}

	}

	/**
	 * This method will handle Sum Switch Case
	 * 
	 * @return result
	 */
	private int handleSumScenario() {
		System.out.println("Operation choosed 'Sum'");
		value1 = Integer.parseInt(inputString(in, ""));
		value2 = Integer.parseInt(inputString(in, ""));
		result = sci.sum(value1, value2);
		return result;
	}

	/**
	 * This method will handle Product Switch Case
	 * 
	 * @return result
	 */
	private int handleProductScenario() {
		System.out.println("Operation choosed 'Product'");
		value1 = Integer.parseInt(inputString(in, ""));
		value2 = Integer.parseInt(inputString(in, ""));
		result = sci.product(value1, value2);
		return result;
	}

	/**
	 * This method will handle Cube Switch Case
	 *
	 * @return result
	 */
	private int handleCubeScenario() {
		System.out.println("Operation choosed 'Cube'");
		value1 = Integer.parseInt(inputString(in, ""));
		result = sci.cube(value1);
		return result;
	}

	/**
	 * This method will handle Square Switch Case
	 * 
	 * @return result
	 */
	private int handleSquareScenario() {
		System.out.println("Operation choosed 'Square'");
		value1 = Integer.parseInt(inputString(in, ""));
		result = sci.square(value1);
		return result;
	}

	/**
	 * This method will handle Exit Switch Case
	 * 
	 * @return result
	 */
	private void handleExitScenario() {
		System.out.println("GoodBye");
		inputString("", "Exit");
		UseCalculator.run = false;
		System.exit(0);
	}

	/**
	 * For Future use, It will take Input from User
	 * 
	 * @return List
	 */
	protected List<Integer> inputInt(String input) {
		List<Integer> list = new ArrayList<Integer>();
		int i = 0;
		System.out.println("Enter the values to be evaluated : ");
		while (i <= 1) {
			sc = new Scanner(System.in);
			list.add(sc.nextInt());
			i++;
			if (input.equals("9")) {
				System.out.println("Closing Scanner resource1");
				sc.close();
			}
		}
		return list;

	}

}

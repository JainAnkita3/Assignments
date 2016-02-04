package com.test.cmn;

import java.util.Scanner;

public class UserInputViaConsole {

	/**
	 * * This method is used to take input from use via Console.
	 * 
	 * @param number
	 *            as String
	 * @return entered number by user
	 */
	public String userInput(String number) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		number = sc.nextLine();
		sc.close();
		return number;
	}

	/**
	 * * This method is used to take input from use via Console.
	 * 
	 * @param number
	 *            as Integer
	 * @return entered number by user
	 */
	public int userInput(int number) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		number = Integer.parseInt(sc.nextLine());
		sc.close();
		return number;
	}

}

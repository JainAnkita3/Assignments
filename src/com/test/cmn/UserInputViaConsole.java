package com.test.cmn;

import java.util.Scanner;

public class UserInputViaConsole {

	/**
	 * * This method is used to take input from use via Console.
	 * 
	 *   @param  number
	 *   @return entered number by user
	 */
	public int userInput(int number) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		number = Integer.parseInt(sc.nextLine());
		sc.close();
		return number;
	}

}

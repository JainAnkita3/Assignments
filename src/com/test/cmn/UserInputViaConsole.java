package com.test.cmn;

import java.util.List;
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

	public int InputViaConsole(List<String> list) {
		int result1 = 0;
		System.out.println("Please provide the numbers needs to be calculated....");
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		list.add(stdin.next());
		do {
			System.out.println("Want to enter more number ?(y/n) : ");
			if (stdin.next().equalsIgnoreCase("Y")) {
				System.out.println("Please enter another number : ");
				list.add(stdin.next());
				System.out.println("Now the list is : " + list);
			} else {
				break;
			}

		} while (true);
		System.out.println("Final list is : " + list);
		stdin.close();
		return result1;
	}

}

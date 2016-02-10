package com.test.calPolymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * This Program will check if number is prime.
 * @author ank
 */

/* This class will take input from Console and perform operations.
 * 
 */

public class ScannerStringOper {

	private static List<String> numbers = new ArrayList<String>();

	public static void main(String[] args) {
		String input = null;

		ScannerStringOper s = new ScannerStringOper();
		//input = s.userInput(numbers);
		/*if (input.equals("+")) {
			System.out.println("Needs to perform Sum");
			System.out.println("Now enter values");
			//int a = Integer.parseInt(s.userInput(numbers));
			//int b = Integer.parseInt(s.userInput(numbers));
			RegularCal rc = new RegularCal();
			rc.sum(a, b);

		}*/

	}

	public List<String> userInput(List<String> list) {
		List<String> result = new ArrayList<String>();
		System.out.println("Please provide the Operations and numbers comma seperated....");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		while (sc.nextLine() != null) {
			// String input = stdin.nextLine();
			list.add(sc.nextLine());

		}
		return list;
	}

}

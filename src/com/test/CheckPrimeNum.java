package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * This Program will check if number is prime.
 * @author ank
 */

public class CheckPrimeNum {

	private static boolean isPrime = true;
	private static int n = 0;

	/*
	 * This method will check if the number is prime return flag.
	 */
	private boolean isPrimeNum(int number) {
		for (int x = 2; x <= number / 2; x++) {
			if (number % x == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	/*
	 * This method will take input from user
	 */
	private int userInput(int num) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be evaluated : ");
		num = Integer.parseInt(sc.nextLine());
		sc.close();
		return num;
	}

	public static void main(String args[]) {
		CheckPrimeNum c = new CheckPrimeNum();
		n = c.userInput(n);
		isPrime = c.isPrimeNum(n);
		if (isPrime)
			System.out.println("'" + n + "' is a Prime number");
		else
			System.out.println("'" + n + "' is not a Prime number");
	}

}

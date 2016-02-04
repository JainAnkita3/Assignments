package com.test;

/*
 * This Program will check if number is prime.
 * @author ank
 */

public class PrintPrimeNum {

	/*
	 * This method will generate the prime no. between 1-100
	 */
	private void generatePrimeNumbers() {
		boolean isPrime;

		// This loop will start the count from 1 till 99.
		for (int i = 1; i < 100; i++) {
			isPrime = true;

			// This inner loop runs multiple times to chk the divisibility of i
			// from each digits(2-9).
			for (int j = 2; j < i && j < 10; j++) {
				// To check if number is prime.
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			printPrimeNumbers(isPrime, i);
		}

	}

	/*
	 * This method will Print the Prime Numbers
	 */
	private void printPrimeNumbers(boolean isPrime, int i) {
		if (isPrime)
			System.out.println(i);

	}

	public static void main(String[] args) {
		System.out.println("Printing the Prime Numbers between 1 to 100");
		PrintPrimeNum pnum = new PrintPrimeNum();
		pnum.generatePrimeNumbers();

	}
}

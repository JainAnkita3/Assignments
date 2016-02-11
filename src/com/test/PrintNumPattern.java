package com.test;

/**
 * Will Print Number in Pattern. 
 * 	
 * 	1 
 * 	1 2 
 * 	1 2 3 
 * 	1 2 3 4 
 * 	1 2 3 4 5
 * 
 * @author ank
 *
 */

public class PrintNumPattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}
}
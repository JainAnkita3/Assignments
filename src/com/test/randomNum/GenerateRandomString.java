package com.test.randomNum;

import java.util.Random;

/**
 * This Class is responsible for generating 8-digit random number
 * 
 * @author ank
 *
 */
public class GenerateRandomString {

	private String result = null;

	/**
	 * Constructor
	 */
	public GenerateRandomString() {
		System.out.println("Generating Hexadecimal 8-digit Random Number");
		generateString();
	}

	private String generateString() {
		Random randomNum = new Random();
		for (int i = 1; i <= 8; i++) {
			System.out.println(randomNum.nextInt(i));
		}
		return result;
	}

	public static void main(String[] args) {
		GenerateRandomString rn = new GenerateRandomString();
	}

}

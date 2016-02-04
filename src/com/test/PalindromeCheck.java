package com.test;

import com.test.cmn.UserInputViaConsole;
import org.apache.log4j.Logger;

public class PalindromeCheck {

	private static int input;

	private boolean palindromeCheck(String in) {

		final Logger logger = Logger.getLogger(PalindromeCheck.class);

		boolean isPalindrome = false;
		int len = in.length();
		System.out.println("Length of the String : " + len);
		for (int i = 0; i <= len - i; i++) {
			isPalindrome = false;
			System.out.println("in.charAt(i) : " + in.charAt(i));
			System.out.println("in.charAt(len) : " + in.charAt(len - 1));
			if (in.charAt(i) == in.charAt(len - 1)) {
				isPalindrome = true;
			}
			len--;
		}
		if (isPalindrome)
			System.out.println("\nIt's **Palindrome**");
		else {
			System.out.println("\nIt's **Not Palindrome**");
		}

		return isPalindrome;
	}

	public static void main(String[] args) {
		UserInputViaConsole u = new UserInputViaConsole();
		try {
			input = u.userInput(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		PalindromeCheck pal = new PalindromeCheck();
		pal.palindromeCheck(Integer.toString(input));

	}
}

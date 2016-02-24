package com.test.collections;

import java.util.Stack;

/**
 * This Class is responsible for reversing the String, 'Hello Welcome to Java'
 * to 'Java to Welcome Hello'.
 * 
 * @author ank
 *
 */
public class StackReverseString {

	private String input = "Hello Welcome to Java";
	private String result = "";
	private String element[] = null; // To store the String elements
	private String regex = "\\s"; // To remove whitespace from String

	public StackReverseString() {
		System.out.println("Reverse the String : \n\t'" + input + "'");
		element = stringToArray(input);
		reverseString(element);
	}

	/**
	 * This method will be responsible for reversing the String
	 * 
	 * @param sa
	 * @return
	 */
	private String reverseString(String[] sa) {
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < element.length; i++) {
			stack.push(element[i]);
			// OR
			// stack.add(i, element[i]);
		}

		for (int j = 0; j < element.length; j++) {
			String so = stack.pop();
			result = result + so + " ";
		}
		System.out.println("The Reversed String is : \n\t'" + result.trim() + "'");
		return result;
	}

	/**
	 * This method will convert String to String[](Array)
	 * 
	 * @param s
	 * @return
	 */
	private String[] stringToArray(String s) {
		element = input.split(regex);
		return element;

	}

	public static void main(String[] args) {
		StackReverseString srs = new StackReverseString();
	}

}

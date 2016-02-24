package com.test.collections;

import java.util.TreeMap;

/**
 * This class will sort the I/P string from char count
 * 
 * @author ank
 *
 */
public class sortStringFromCharCount {

	String input = "Hello Welcome to Java";
	String[] element;
	String regex = "\\s";

	/**
	 * Constructor
	 */
	public sortStringFromCharCount() {
		stringToArray(input);
		sortString(element);
	}

	/**
	 * This will sort the I/P String
	 * 
	 * @param s
	 */
	private void sortString(String[] s) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		Integer key;
		String value;

		// Count the characters of a string
		for (int i = 0; i < element.length; i++) {
			value = element[i];
			key = element[i].length();
			tm.put(key, value);
		}
		// System.out.println("I/P: " + tm);
		System.out.println("O/P : " + tm.descendingMap());
		System.out.println("Sorted String : \n\t" + tm.values());
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
		sortStringFromCharCount s = new sortStringFromCharCount();
	}

}

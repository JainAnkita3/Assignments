package com.test;


/*
 * This Program will check if number is prime.
 * @author ank
 */

public class DataTypeTest {

	public static void main(String[] args) {
		// 012345689012345
		String s = "Heeello, Weeelcomee Java";

		System.out.println(s);

		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("-->" + s.trim() + "<--");
		System.out.println(s.indexOf("e"));
		System.out.println(s.indexOf("ello"));
		System.out.println(s.indexOf("elllo123"));
		System.out.println(s.indexOf("e", 2));
		System.out.println(s.indexOf("e", 1)); // 1
		System.out.println(s.indexOf("z")); // 1

		System.out.println(s.lastIndexOf("e")); //
		System.out.println(s.lastIndexOf("e", 14)); //

		System.out.println(s.charAt(9)); //

		System.out.println(s.contains("ello")); //
		System.out.println(s.contains("ello123")); //

		System.out.println(s.startsWith("e")); //

		System.out.println(s.isEmpty()); //

		// Not
		System.out.println(!s.isEmpty()); //

		System.out.println(s.length());

		// s = s.replace('e', 'X');

		s = s.replace("ee", "e");

		// To replace all e's with e.
		s = s.replaceAll("ee", "e");

		System.out.println(s);

		System.out.println(s.substring(2, 4));

	}

}

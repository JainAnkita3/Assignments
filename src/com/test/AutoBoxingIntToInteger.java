package com.test;

public class AutoBoxingIntToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 20;

		Integer i1 = new Integer(20);

		// String to int/INteger
		String s = "100";
		i1 = new Integer(s);
		System.out.println(s);

		i = Integer.parseInt(s);
		System.out.println(i1);
		System.out.println(i);

		// Int to Integer/String
		i = 40;
		s = "" + i;
		i1 = i;
		// or
		i1 = new Integer(i);
		System.out.println(s);
		System.out.println(i1);
		System.out.println(i);

		// Integer to int/String
		i1 = 60;
		s = "" + i1;
		// or
		s = i1.toString();
		i = i1.intValue();
		System.out.println(s);
		System.out.println(i1);
		System.out.println(i);

	}

}

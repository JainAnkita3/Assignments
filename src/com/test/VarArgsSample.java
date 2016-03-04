package com.test;

public class VarArgsSample {

	// 'Variable arity method' and 'Variable arity parameter'
	static int sum(int i, int... marks) { // Varargs indicated by elipsis i.e.
											// ==> (...)
		int total = 0;
		for (int mark : marks) {
			total = total + mark;
		}
		return total;
	}

	public static void main(String[] args) {

		// Invoking using Varargs
		System.out.println(sum(2, 3, 4, 6, 7, 7, 8, 8));

		// Invocation using Array
		int array[] = { 2, 3 };
		System.out.println(sum(1, array));

	}

}

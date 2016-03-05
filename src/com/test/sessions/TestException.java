package com.test.sessions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {

	String s = "a";

	public static void main(String[] args) {
		TestException t = new TestException();
		/*
		 * try { System.out.println("S: " + t.s.toUpperCase()); // Nothing
		 * showing // but // will throw Null // Pointer, bcz s is // Null. }
		 * catch (NullPointerException e) { System.out.println(
		 * "String s is not declared"); } try { Scanner s = new
		 * Scanner(System.in); int s1 = s.nextInt(); System.out.println(s1); }
		 * catch (InputMismatchException ine) { System.out.println(
		 * "Invalid Input");
		 */
		// Avoid to write 2-try catch block

		try {
			System.out.println(t.s.toUpperCase()); // Nothing showing
			// but will throw Null
			// Pointer, bcz s is Null.
			System.out.println("Enter value:: ");
			Scanner s = new Scanner(System.in);
			int s1 = s.nextInt();
			System.out.println(s1);
		}
		// To throw generic exception
		/*
		 * catch (InputMismatchException ine) { System.out.println(
		 * "Invalid Input");
		 * 
		 * } catch (NullPointerException e) { System.out.println(
		 * "String s is not declared"); }
		 */
		catch (InputMismatchException ine) {
			System.out.println("Invalid Input");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occured : " + e);
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Exception occured throwable : " + e.getMessage());
		}

		try {
			t.sayHello();
		} catch (MyException e) {
			// Divide by Zero Exception.
			e.printStackTrace();
			System.out.println("Hanlde in Main method");

		}
		System.out.println("GoodBye");
	}

	/*public void sayHello() throws ArithmeticException, Exception {
		int a = 20;
		int b = 0;
		String s = null;
		// Will throw NullPointer as its not Caught it will halt the program on
		// main method
		// To avoid the Halt of Program we can define generic "Exception" with
		// Arithmetic One.

		// Use of "throw" keyword
		if (s == null) {
			throw new NullPointerException();
		}
		System.out.println("S is : " + s.toLowerCase());
		int c = a / b;
		System.out.println("Hello" + c);

	}*/
	
	
	public void sayHello() throws MyException {
		int a = 20;
		int b = 0;
		String s = null;
		// Will throw NullPointer as its not Caught it will halt the program on
		// main method
		// To avoid the Halt of Program we can define generic "Exception" with
		// Arithmetic One.

		// Use of "throw" keyword
		if (s == null) {
			throw new MyException();
		}
		System.out.println("S is : " + s.toLowerCase());
		int c = a / b;
		System.out.println("Hello" + c);

	}

	public void sayHi() {
		// TODO Auto-generated method stub

	}

}

package com.test;

public class TestError {

	// This will go into Infinte Loop and throw StackOverflow error
	
	public static void main(String[] args) {
		TestError t = new TestError();
		t.sayHi();

		System.out.println("GoodBye");

	}

	public void sayHi() {
		System.out.println("Hi");
		sayHello();
	}

	public void sayHello() {
		System.out.println("Hello");
		sayHi();
	}

}

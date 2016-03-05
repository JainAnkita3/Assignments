package com.test.sessions;

public class TestException1 {

	String s = "a";

	public static void main(String[] args) {
		TestException1 te = new TestException1();
		try {
			te.sayHi();
			System.out.println(1);
		}

		catch (NullPointerException ne) {
			ne.printStackTrace();
			System.out.println(2);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(2);
		}
		// Finally Block always gets executed
		finally {
			System.out.println("GoodbYe");
		}
	}

	public void sayHi() {
		System.out.println("Hi");
		int c = 20 / 0;
	}

}

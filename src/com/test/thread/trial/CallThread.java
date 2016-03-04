package com.test.thread.trial;

public class CallThread {

	public static void main(String[] args) {

		System.out.println("Call Extend thread");
		ExtendThread e = new ExtendThread("Hello");
		e.start();
		
		
		
	}

}

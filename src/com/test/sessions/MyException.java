package com.test;

public class MyException extends Exception {

	public MyException() {
		super();
		
	}
	
	public MyException(String msg) {
		super(msg);
		
	}
		
	@Override
	public String getMessage(){
		System.out.println("Its a userdefine exception");
		return e.ge;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

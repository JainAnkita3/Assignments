package com.test.sessions;

public class MyException extends Exception {

	String msg = "";
	
	public MyException() {
		super();
		
	}
	
	public MyException(String msg) {
		super(msg);
		
	}
		
	@Override
	public String getMessage(){
		System.out.println("Its a userdefine exception");
		return msg;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

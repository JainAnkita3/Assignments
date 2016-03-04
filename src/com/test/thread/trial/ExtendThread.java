package com.test.thread.trial;

public class ExtendThread extends Thread {

	String message;

	public ExtendThread(String msg) {
		this.message = msg;
		System.out.println(message);

	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread : " + getName() + " count : " + i);
		}

	}
}

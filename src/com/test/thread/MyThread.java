package com.test.thread;

public class MyThread implements Runnable {

	@Override
	public void run() {

		// checking for daemon thread
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
		
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);

		}

	}

}

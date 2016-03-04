package com.test.thread;

public class MyExtendedThread extends Thread {

	@Override
		public void run() {
			System.out.println("Thread is running from Extended Class");
		}
}

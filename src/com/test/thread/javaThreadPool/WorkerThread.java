package com.test.thread.javaThreadPool;

/**
 * This will run the Thread from the Pool
 * 
 * @author ank
 *
 */
public class WorkerThread implements Runnable {

	private String message;
	private int[] args = { 1, 2, 3, 4 };

	public WorkerThread(String msg) {
		this.message = msg;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
		processMessage();
		System.out.println(Thread.currentThread().getName() + " (End)" + message);
	}

	private void processMessage() {
		try {

			System.out.println("Sum : " + sum(args));
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private int sum(int... args) {
		int result = 0;
		System.out.println("Performing Sum");
		for (int i : args) {
			result += i;
		}

		return result;
	}

}

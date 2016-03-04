package com.test.thread.javaThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * This will create a thread pool
 * 
 * @author ank
 *
 */
public class JavaThreadPool {

	public static void main(String[] args) {

		int numOfThreads = 5;
		// Creating Pool of 5 threads
		ExecutorService executor = Executors.newFixedThreadPool(numOfThreads);
		for (int i = 0; i < 10; i++) {
			WorkerThread worker = new WorkerThread("" + i);
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("All Threads Finished");
	}

}

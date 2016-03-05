package com.test.thread;

public class CallingThread {

	static Thread t1;

	public static void main(String[] args) {

		boolean on = true;

		// If implementing Interface.
		MyThread my = new MyThread();

		t1 = new Thread(my);
		// Making t1 a Daemon thread
		t1.setDaemon(on);
		t1.setName("DaemonThread1");
		// System.out.println(t1.getName() + " is a Daemon : " + t1.isDaemon());
		t1.start();
		// t1.setDaemon(on); // If thread started and then Set as a Daemon will
		// throw IllegalStateExcep.

		Thread t2 = new Thread(my);
		t2.setName("Thread2");
		t2.start();
		// If Start thread twice will throw IllegalThreadStateException
		// t2.start();

		Thread t3 = new Thread(my);
		t3.setName("Thread3");
		t3.start();

		// If Extending Thread class
		MyExtendedThread et = new MyExtendedThread();
		et.start();
		 System.out.println("...." + et.getState());

	}

}

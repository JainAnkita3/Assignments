package com.test.sessions;

class Printer extends Thread {

	boolean isPrintingIdle = false;

	public void run() {
		print();

	}

	public void print() {

		do {
			synchronized (this) {

				System.out.println("Printing Doc  : Printer is Idle");
				try {
					this.wait();
					System.out.println("Printing Doc  : Printer is Busy");

				} catch (InterruptedException e1) {
					e1.printStackTrace();

				}
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}

			}

		} while (true);

	}

	public void printDocument(String doc) {

		synchronized (this) {
			this.notify();
			System.out.println("Got Notification that printer is idle");
			System.out.println("Printer Task : " + doc);

		}
	}
}

class Employee extends Thread {

	Printer p;
	String doc;

	public Employee(Printer printer, String doc) {
		super();
		this.p = printer;
		this.doc = doc;
	}

	public void run() {
		p.printDocument(doc);
	}
}

public class Main {

	public static void main(String[] args) {

		Printer p = new Printer();
		Employee e1 = new Employee(p, "a");
		Employee e2 = new Employee(p, "b");

		e1.start();
		e2.start();

		p.start();
	}

}
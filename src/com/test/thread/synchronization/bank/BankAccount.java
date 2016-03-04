package com.test.thread.synchronization.bank;

public class BankAccount {
	int balance = 0;

	public void doTransaction(String txType, int amount) {
		synchronized (this) {
			
		}
		
		System.out.println("New Balance : " + balance);
		if (txType.equalsIgnoreCase("Credit")) {
			balance += amount;
			System.out.println("Credited : " + balance);

		} else {
			balance = balance - amount;
			System.out.println("Debited : " + balance);

		}
		System.out.println("New Balance is : " + balance);
		

	}

}

package com.test.thread.synchronization.bank;

public class Bank implements Runnable {

	BankAccount b;
	String txType;

	public Bank(BankAccount ba, String txnType) {
		this.b = ba;
		this.txType = txnType;
	}

	@Override
	public void run() {

		synchronized (b) {
			for (int i = 0; i < 3; i++) {
				b.doTransaction(txType, 100);
				try {
					Thread.currentThread().sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();

		Bank bnk = new Bank(ba, "Credit");
		Bank bnk2 = new Bank(ba, "Debit");

		Thread bank = new Thread(bnk);
		Thread mobileApp = new Thread(bnk2);

		bank.start();
		mobileApp.start();

	}

}

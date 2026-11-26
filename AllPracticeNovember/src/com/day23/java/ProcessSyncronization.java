package com.day23.java;

// Prevents race conditions by controlling access to shared resources

class BankAccount1 {

    private int balance = 1000;

    public synchronized void deposit(int amount){
        
        balance += amount;
        System.out.println("Deposited: " + amount
                           + ", Balance: " + balance);
    }

    public synchronized void withdraw(int amount){
        
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount
                               + ", Balance: " + balance);
        }
        else {
            System.out.println(
                "Insufficient balance to withdraw: "
                + amount);
        }
    }

    public int getBalance() { return balance; }
}

public class ProcessSyncronization {

	public static void main(String[] args) {

		BankAccount1 account = new BankAccount1();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				account.deposit(200);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				account.withdraw(100);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final Balance: " + account.getBalance());
	}
}

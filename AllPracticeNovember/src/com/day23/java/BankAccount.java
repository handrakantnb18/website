package com.day23.java;

// one thread can execute the withdrawal operation at a time

public class BankAccount {

	private int balance = 10000;

	public synchronized void withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient balance");
		}
	}

}

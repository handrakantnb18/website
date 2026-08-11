package com.day10.java8ProgramsPractice;

// only one thread at a time can execute the 
// synchronized method for the same BankAccount object.

public class BankAccountBal {

	private int balance = 5000;
	
	public synchronized void withdraw(int amount) {
		
		if(balance >= amount) {
			balance = balance - amount;
			System.out.println(
					Thread.currentThread().getName()
					+" Remaining Balance :"+balance
					
					);
		}
	}
}

package com.day10.java8ProgramsPractice;

// If two threads execute withdraw() simultaneously, both 
// may read the same balance before either updates it.
public class BankAccount {

	private int balance = 5000;
	
	public void withdraw(int amount)
	{
		if(balance >= amount) {
			balance = balance - amount;
			System.out.println("Balance : "+balance);
		}
	}
}

package com.zeroToHero.corejava.oopsConcepts;

import javax.security.auth.login.AccountException;

//Java Program to demonstrate the working of a banking-system    
//where we deposit and withdraw amount from our account.    
//Creating an Account class which has deposit() and withdraw() methods  

class Account {
	
	int acc_no;
	String name;
	float amount;
	
	void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}
	
	void deposite(float amt) {
		amount = amount + amt;
		System.out.println(amt+" deposited");
	}
	
	void withdraw(float amt) {
		if(amount < amt) {
			System.out.println("Insufficient Balance..");
		}
		else {
			amount = amount-amt;
			System.out.println(amt+ " withdraw");
		}
	}
	
	void checkBalance() {
		System.out.println("Balance is : "+amount);
	}
	
	void display() {
		System.out.println(acc_no+ " "+name+" "+amount);
	}
	
}

public class MainAccount {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		a1.insert(874455, "Chandrakant", 10000);
		a1.display();
		
		a1.checkBalance();
		a1.deposite(50000);
		a1.checkBalance();
		
		a1.withdraw(15000);
		a1.checkBalance();
	}
}

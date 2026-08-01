package com.zeroToHero.corejava.oopsConcepts;

class Account1 {
	
	int acc_no;
	String name;
	float amount;
	
	void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}
	
	void deposit(float amt) {
		amount = amount+amt;
		System.out.println(amt+" Deposited..");
	}
	
	void withdraw(float amt) {
		if(amount < amt) {
			System.out.println("Insufficent Balance..");
		}
		else {
			amount = amount - amt;
			System.out.println(amt+ " withdraw");
		}
	}
	
	void checkBalance()
	{
		System.out.println("Balance is : "+amount);
	}
	void display()
	{
		System.out.println(acc_no+ " "+name+ " "+amount);
	}
}


public class MainAccountOne {

	public static void main(String[] args) {
		
		Account1 a1 = new Account1();
		a1.insert(655656, "Shivraj", 5000);
		a1.display();
		
		a1.checkBalance();
		a1.deposit(500000);
		
		a1.checkBalance();
		a1.withdraw(30000);
		
		a1.checkBalance();
		
	}
}

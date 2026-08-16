package com.zeroToHero.thread;

// multiple users can perform transactions like deposits, 
// withdrawals, and fund transfers at the same time

public class MultithreadingBank extends Thread {

	private String transactionName;
	
	MultithreadingBank(String name){
		this.transactionName = name;
	}
	
	public void run() {
		System.out.println(transactionName + " Started..");
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(transactionName+ "Complated..");
	}
	
	public static void main(String[] args) {
		
		MultithreadingBank m1 = new MultithreadingBank("Diposited...");
		MultithreadingBank m2 = new MultithreadingBank("Withdrawal..");
		
		m1.start();
		m2.start();
	}
}

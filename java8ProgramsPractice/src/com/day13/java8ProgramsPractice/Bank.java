package com.day13.java8ProgramsPractice;

public class Bank {

	private Integer accountNumber;
	
	private String bankName;
	
	private String bankHolderName;
	
	private String branch;
	
	private Double balance;

	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", bankName=" + bankName + ", bankHolderName=" + bankHolderName
				+ ", branch=" + branch + ", balance=" + balance + "]";
	}
	
	
}

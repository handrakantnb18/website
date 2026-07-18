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

	public Bank(Integer accountNumber, String bankName, String bankHolderName, String branch, Double balance) {
		super();
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.bankHolderName = bankHolderName;
		this.branch = branch;
		this.balance = balance;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankHolderName() {
		return bankHolderName;
	}

	public void setBankHolderName(String bankHolderName) {
		this.bankHolderName = bankHolderName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

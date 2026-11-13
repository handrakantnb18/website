package com.day12.java;

public class Bank {

	private Integer bid;

	private String name;

	private Double balance;

	private String branch;

	private String city;

	private String accountType;

	public Bank(Integer bid, String name, Double balance, String branch, String city, String accountType) {
		super();
		this.bid = bid;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
		this.city = city;
		this.accountType = accountType;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Bank [bid=" + bid + ", name=" + name + ", balance=" + balance + ", branch=" + branch + ", city=" + city
				+ ", accountType=" + accountType + "]";
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}

package com.day20.java;

public class Bank {

	private Integer id;
	
	private String name;

	private Double balance;

	private String branch;

	private String city;

	private String accountType;

	public Bank(Integer id, String name, Double balance, String branch, String city, String accountType) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
		this.city = city;
		this.accountType = accountType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Bank(Integer id, String name, Double balance, String branch, String city, String accountType) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
		this.city = city;
		this.accountType = accountType;
	}
	
	
	
}

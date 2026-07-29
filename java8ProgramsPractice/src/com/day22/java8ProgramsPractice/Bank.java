package com.day22.java8ProgramsPractice;

public class Bank {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private Long mobile;
	
	private String branch;
	
	private String accountType;
	
	private Double balance;

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", branch=" + branch
				+ ", accountType=" + accountType + ", balance=" + balance + "]";
	}

	public Bank(Integer id, String name, String email, Long mobile, String branch, String accountType, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.branch = branch;
		this.accountType = accountType;
		this.balance = balance;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	
}

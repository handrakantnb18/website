package com.day3.java8ProgramsPractice;

public class Bank {

	private Integer id;
	
	private String name;
	
	private String city;
	
	private String mobileNo;
	
	private String email;
	
	private Double balance;

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", city=" + city + ", mobileNo=" + mobileNo + ", email=" + email
				+ ", balance=" + balance + "]";
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Bank(Integer id, String name, String city, String mobileNo, String email, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobileNo = mobileNo;
		this.email = email;
		this.balance = balance;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

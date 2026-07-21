package com.day16.java8ProgramsPractice;

public class Bank {

	private Integer id;
	
	private String name;
	
	private Integer accountNo;
	
	private String email;
	
	private Long mobileNo;

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", accountNo=" + accountNo + ", email=" + email + ", mobileNo="
				+ mobileNo + "]";
	}

	public Bank(Integer id, String name, Integer accountNo, String email, Long mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.accountNo = accountNo;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
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

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}

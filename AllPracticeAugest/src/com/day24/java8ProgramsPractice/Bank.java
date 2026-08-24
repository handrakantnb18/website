package com.day24.java8ProgramsPractice;

public class Bank {

	private Integer id;
	
	private String name;
	
	private String address;
	
	private String email;
	
	private String mobileNo;
	
	private Long accountNo;
	
	private String branch;

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", mobileNo="
				+ mobileNo + ", accountNo=" + accountNo + ", branch=" + branch + "]";
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Bank(Integer id, String name, String address, String email, String mobileNo, Long accountNo, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.mobileNo = mobileNo;
		this.accountNo = accountNo;
		this.branch = branch;
	}
	
	
	
}

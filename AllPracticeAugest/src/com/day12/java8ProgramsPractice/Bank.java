package com.day12.java8ProgramsPractice;

public class Bank {

	private Integer id;
	
	private String bankName;
	
	private String address;
	
	private String mobile;
	
	private Double accountNo;
	
	private String email;
	
	private String accountType;

	@Override
	public String toString() {
		return "Bank [id=" + id + ", bankName=" + bankName + ", address=" + address + ", mobile=" + mobile
				+ ", accountNo=" + accountNo + ", email=" + email + ", accountType=" + accountType + "]";
	}

	public Bank(Integer id, String bankName, String address, String mobile, Double accountNo, String email,
			String accountType) {
		super();
		this.id = id;
		this.bankName = bankName;
		this.address = address;
		this.mobile = mobile;
		this.accountNo = accountNo;
		this.email = email;
		this.accountType = accountType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Double getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Double accountNo) {
		this.accountNo = accountNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
}

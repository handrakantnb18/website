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
	
	
}

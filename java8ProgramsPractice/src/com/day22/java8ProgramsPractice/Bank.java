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
	
	
	
}

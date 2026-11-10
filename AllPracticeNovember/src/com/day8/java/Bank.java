package com.day8.java;

public class Bank {

	private Integer bid;

	private String name;

	private Double balance;

	private String branch;

	private String city;

	private String accountType;

	
	@Override
	public String toString() {
		return "Bank [bid=" + bid + ", name=" + name + ", balance=" + balance + ", branch=" + branch + ", city=" + city
				+ ", accountType=" + accountType + "]";
	}
	
	

}

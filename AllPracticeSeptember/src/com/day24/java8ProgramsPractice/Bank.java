package com.day24.java8ProgramsPractice;

public class Bank {

	private Integer id;
	
	private String username;
	
	private String password;
	
	private String email;
	
	private Double amount;
	
	private String city;
	
	private String accountType;

	@Override
	public String toString() {
		return "Bank [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", amount="
				+ amount + ", city=" + city + ", accountType=" + accountType + "]";
	}
	
	
	
}

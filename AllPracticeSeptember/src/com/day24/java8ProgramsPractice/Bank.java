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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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

	public Bank(Integer id, String username, String password, String email, Double amount, String city,
			String accountType) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.amount = amount;
		this.city = city;
		this.accountType = accountType;
	}
	
	
	
}

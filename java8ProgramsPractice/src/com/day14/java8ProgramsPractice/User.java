package com.day14.java8ProgramsPractice;

public class User {

	private Integer id;
	
	private String name;
	
	private String address;
	
	private String email;
	
	private String mobileNo;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", mobileNo="
				+ mobileNo + "]";
	}

	public User(Integer id, String name, String address, String email, String mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.mobileNo = mobileNo;
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
	
	
}

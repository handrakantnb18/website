package com.day7.java8ProgramsPractice;

public class User {

	
	private Integer id;
	
	private String name;
	
	private String Address;
	
	private String mobileNo;

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
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Address=" + Address + ", mobileNo=" + mobileNo + "]";
	}

	public User(Integer id, String name, String address, String mobileNo) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		this.mobileNo = mobileNo;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

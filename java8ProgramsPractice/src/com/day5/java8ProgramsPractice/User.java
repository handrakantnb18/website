package com.day5.java8ProgramsPractice;

public class User {

	private Integer id;
	
	private String name;
	
	private String address;
	
	private String mobileNo;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}

	public User(Integer id, String name, String address, String mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	
	
}

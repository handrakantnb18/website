package com.day10.java8ProgramsPractice;

public class User {

	private Integer id;
	
	private String name;
	
	private String city;
	
	private String mobileNo;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", mobileNo=" + mobileNo + "]";
	}

	public User(Integer id, String name, String city, String mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobileNo = mobileNo;
	}
	
	
}

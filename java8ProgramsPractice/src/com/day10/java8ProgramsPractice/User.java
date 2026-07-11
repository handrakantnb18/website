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

	public User() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
}

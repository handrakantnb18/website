package com.day8.java8ProgramsPractice;

public class User {

	private Integer id;
	
	private String name;
	
	private String mobileNo;
	
	private String city;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobileNo=" + mobileNo + ", city=" + city + "]";
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User(Integer id, String name, String mobileNo, String city) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.city = city;
	}

	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

package com.day7.java8ProgramsPractice;

public class User {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private String address;
	
	private String mobileNo;
	
	private String dept;
	
	private String city;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", mobileNo="
				+ mobileNo + ", dept=" + dept + ", city=" + city + "]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User(Integer id, String name, String email, String address, String mobileNo, String dept, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobileNo = mobileNo;
		this.dept = dept;
		this.city = city;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

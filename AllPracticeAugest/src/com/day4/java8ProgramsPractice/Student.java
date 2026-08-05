package com.day4.java8ProgramsPractice;

public class Student {
	
	private Integer id;

	private String name;
	
	private String collage;
	
	private String address;
	
	private String mobileNo;
	
	private String email;
	
	private String city;

	public Student(Integer id, String name, String collage, String address, String mobileNo, String email,
			String city) {
		super();
		this.id = id;
		this.name = name;
		this.collage = collage;
		this.address = address;
		this.mobileNo = mobileNo;
		this.email = email;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", collage=" + collage + ", address=" + address + ", mobileNo="
				+ mobileNo + ", email=" + email + ", city=" + city + "]";
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

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

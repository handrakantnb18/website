package com.day4.java8ProgramsPractice;

public class Student {
	
	private Integer id;

	private String name;
	
	private String collage;
	
	private String address;
	
	private String mobileNo;
	
	private String email;
	
	private String cource;

	public Student(Integer id, String name, String collage, String address, String mobileNo, String email,
			String cource) {
		super();
		this.id = id;
		this.name = name;
		this.collage = collage;
		this.address = address;
		this.mobileNo = mobileNo;
		this.email = email;
		this.cource = cource;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", collage=" + collage + ", address=" + address + ", mobileNo="
				+ mobileNo + ", email=" + email + ", cource=" + cource + "]";
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

	public String getCource() {
		return cource;
	}

	public void setCity(String cource) {
		this.cource = cource;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

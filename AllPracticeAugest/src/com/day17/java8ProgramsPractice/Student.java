package com.day17.java8ProgramsPractice;

public class Student {

	private Integer id;
	
	private String name;
	
	private String collage;
	
	private String email;
	
	private String mobileNo;
	
	private Double marks;
	
	private String address;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", collage=" + collage + ", email=" + email + ", mobileNo="
				+ mobileNo + ", marks=" + marks + ", address=" + address + "]";
	}

	public Student(Integer id, String name, String collage, String email, String mobileNo, Double marks,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.collage = collage;
		this.email = email;
		this.mobileNo = mobileNo;
		this.marks = marks;
		this.address = address;
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

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

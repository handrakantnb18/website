package com.day8.java8ProgramsPractice;

public class Student {

	private Integer id;
	
	private String name;
	
	private String course;
	
	private String email;
	
	private String mobileNo;
	
	private String dept;
	
	private String address;

	public Student(Integer id, String name, String course, String email, String mobileNo, String dept, String address) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
		this.mobileNo = mobileNo;
		this.dept = dept;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", email=" + email + ", mobileNo="
				+ mobileNo + ", dept=" + dept + ", address=" + address + "]";
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

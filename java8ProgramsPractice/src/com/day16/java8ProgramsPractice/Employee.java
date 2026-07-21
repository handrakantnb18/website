package com.day16.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private String dept;
	
	private Integer mobileNo;
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", dept=" + dept + ", mobileNo="
				+ mobileNo + "]";
	}



	public Employee(Integer id, String name, String email, String dept, Integer mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dept = dept;
		this.mobileNo = mobileNo;
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



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public Integer getMobileNo() {
		return mobileNo;
	}



	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}

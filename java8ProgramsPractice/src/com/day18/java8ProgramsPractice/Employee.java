package com.day18.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String dept;
	
	private String email;
	
	private String mobileNo;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", email=" + email + ", mobileNo="
				+ mobileNo + "]";
	}

	
	
	public Employee(Integer id, String name, String dept, String email, String mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.email = email;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
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
	
	
	
}

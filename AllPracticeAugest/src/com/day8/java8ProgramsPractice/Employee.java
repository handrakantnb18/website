package com.day8.java8ProgramsPractice;

public class Employee {

	private Integer empid;
	
	private String name;
	
	private String email;
	
	private String dept;
	
	private String address;
	
	private String mobileNo;
	
	private String gender;

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", email=" + email + ", dept=" + dept + ", address="
				+ address + ", mobileNo=" + mobileNo + ", gender=" + gender + "]";
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Employee(Integer empid, String name, String email, String dept, String address, String mobileNo,
			String gender) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.dept = dept;
		this.address = address;
		this.mobileNo = mobileNo;
		this.gender = gender;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

package com.day23.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String ename;
	
	private String email;
	
	private Double salary;
	
	private String address;
	
	private String mobileNo;
	
	private String dept;

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", email=" + email + ", salary=" + salary + ", address="
				+ address + ", mobileNo=" + mobileNo + ", dept=" + dept + "]";
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
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


	public Employee(Integer id, String ename, String email, Double salary, String address, String mobileNo,
			String dept) {
		super();
		this.id = id;
		this.ename = ename;
		this.email = email;
		this.salary = salary;
		this.address = address;
		this.mobileNo = mobileNo;
		this.dept = dept;
	}
	
	
	
}

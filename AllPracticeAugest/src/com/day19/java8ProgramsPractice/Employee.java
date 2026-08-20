package com.day19.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String address;
	
	private String dept;
	
	private Double salary;
	
	private String email;
	
	private String mobileNo;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", dept=" + dept + ", salary="
				+ salary + ", email=" + email + ", mobileNo=" + mobileNo + "]";
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
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

	public Employee(Integer id, String name, String address, String dept, Double salary, String email,
			String mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dept = dept;
		this.salary = salary;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	
	
	
}

package com.day27.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String dept;
	
	private String mobileNo;
	
	private Double salary;
	
	private String address;
	
	private String email;
	
	private String designation;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", mobileNo=" + mobileNo + ", salary="
				+ salary + ", address=" + address + ", email=" + email + ", designation=" + designation + "]";
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employee(Integer id, String name, String dept, String mobileNo, Double salary, String address, String email,
			String designation) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.mobileNo = mobileNo;
		this.salary = salary;
		this.address = address;
		this.email = email;
		this.designation = designation;
	}
	
	
}

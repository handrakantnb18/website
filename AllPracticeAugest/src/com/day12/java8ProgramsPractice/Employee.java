package com.day12.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private String mobileNo;
	
	private String dept;
	
	private String address;
	
	private String gender;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + ", dept="
				+ dept + ", address=" + address + ", gender=" + gender + "]";
	}

	public Employee(Integer id, String name, String email, String mobileNo, String dept, String address,
			String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.dept = dept;
		this.address = address;
		this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

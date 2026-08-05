package com.day4.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String city;
	
	private String mobile;
	
	private String email;
	
	private String dept;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", mobile=" + mobile + ", email=" + email
				+ ", dept=" + dept + "]";
	}

	public Employee(Integer id, String name, String city, String mobile, String email, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobile = mobile;
		this.email = email;
		this.dept = dept;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}


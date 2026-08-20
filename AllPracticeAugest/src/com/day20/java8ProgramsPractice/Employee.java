package com.day20.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String dept;
	
	private String MobileNo;
	
	private Double salary;
	
	private String city;
	
	private String email;
	
	private String course;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", MobileNo=" + MobileNo + ", salary="
				+ salary + ", city=" + city + ", email=" + email + ", course=" + course + "]";
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
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Employee(Integer id, String name, String dept, String mobileNo, Double salary, String city, String email,
			String course) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		MobileNo = mobileNo;
		this.salary = salary;
		this.city = city;
		this.email = email;
		this.course = course;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

package com.day1.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String name;
	
	private Double salary;
	
	private Integer experience;
	
	private String dept;
	
	private String mobileNo;
	
	private String email;

	public Employee(Integer id, String name, Double salary, Integer experience, String dept, String mobileNo,
			String email) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.experience = experience;
		this.dept = dept;
		this.mobileNo = mobileNo;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", experience=" + experience + ", dept="
				+ dept + ", mobileNo=" + mobileNo + ", email=" + email + "]";
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

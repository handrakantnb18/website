package com.day24.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private Double salary;
	
	private String addedss;
	
	private String dept;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", addedss="
				+ addedss + ", dept=" + dept + "]";
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getAddedss() {
		return addedss;
	}

	public void setAddedss(String addedss) {
		this.addedss = addedss;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee(Integer id, String name, String email, Double salary, String addedss, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.addedss = addedss;
		this.dept = dept;
	}
	
	
}

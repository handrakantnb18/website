package com.day24.java;

public class Employee {

	private Integer id;

	private String name;

	private String email;

	private Double salary;

	private String empType;

	private String city;

	private String project;

	private String department;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", empType="
				+ empType + ", city=" + city + ", project=" + project + ", department=" + department + "]";
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

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee(Integer id, String name, String email, Double salary, String empType, String city, String project,
			String department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.empType = empType;
		this.city = city;
		this.project = project;
		this.department = department;
	}

	
	
	
	
}

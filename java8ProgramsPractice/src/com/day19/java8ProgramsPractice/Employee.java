package com.day19.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private String location;
	
	private Double salary;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", location=" + location + ", salary="
				+ salary + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, String email, String location, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.location = location;
		this.salary = salary;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	
}

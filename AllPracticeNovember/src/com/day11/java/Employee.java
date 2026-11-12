package com.day11.java;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private Double salary;
	
	private String city;
	
	private String branch;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", city=" + city
				+ ", branch=" + branch + "]";
	}

	public Employee(Integer id, String name, String email, Double salary, String city, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.city = city;
		this.branch = branch;
	}
	
	
	
	
}

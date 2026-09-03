package com.day3.java17features;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private String dept;
	
	private Double salary;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", dept=" + dept + ", salary=" + salary
				+ "]";
	}
	
	
}

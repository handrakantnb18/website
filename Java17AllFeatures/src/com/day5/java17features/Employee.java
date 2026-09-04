package com.day5.java17features;

public class Employee {

private Integer id;
	
	private String name;
	
	private String email;
	
	private Double salary;
	
	private String dept;
	
	private String city;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", dept=" + dept
				+ ", city=" + city + "]";
	}
	
	
}

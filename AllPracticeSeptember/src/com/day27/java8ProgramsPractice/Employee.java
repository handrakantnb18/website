package com.day27.java8ProgramsPractice;

public class Employee {

	private Long id;
	
	private String name;
	
	private String email;
	
	private Double salary;
	
	private String dept;
	
	private String city;
	
	private String desc;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", dept=" + dept
				+ ", city=" + city + ", desc=" + desc + "]";
	}
	
	
}

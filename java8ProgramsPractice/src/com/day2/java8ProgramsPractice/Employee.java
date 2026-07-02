package com.day2.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String city;
	
	private String Dept;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", Dept=" + Dept + "]";
	}

	public Employee(Integer id, String name, String city, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		Dept = dept;
	}
	
	
}

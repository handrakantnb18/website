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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}
	
	
}

package com.day2.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String city;
	
	private String Dept;
	
	private Double salary;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", Dept=" + Dept + ", salary=" + salary
				+ "]";
	}

	public Employee(Integer id, String name, String city, String dept, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		Dept = dept;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	

}

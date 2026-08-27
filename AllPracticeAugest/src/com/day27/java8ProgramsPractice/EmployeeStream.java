package com.day27.java8ProgramsPractice;

public class EmployeeStream {

	private Integer id;
	
	private String name;
	
	private String dept;
	
	private Double salary;

	public EmployeeStream(Integer id, String name, String dept, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeStream [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}

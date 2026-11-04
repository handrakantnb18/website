package com.day4.java;

public class Employee {

	private Integer id;

	private String name;

	private String email;

	private Double Salary;

	private String empType;

	private String city;

	private String PRoject;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", Salary=" + Salary + ", empType="
				+ empType + ", city=" + city + ", PRoject=" + PRoject + "]";
	}

	public Employee(Integer id, String name, String email, Double salary, String empType, String city, String pRoject) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		Salary = salary;
		this.empType = empType;
		this.city = city;
		PRoject = pRoject;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
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

	public String getPRoject() {
		return PRoject;
	}

	public void setPRoject(String pRoject) {
		PRoject = pRoject;
	}


	

}

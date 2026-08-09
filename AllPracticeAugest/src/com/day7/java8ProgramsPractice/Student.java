package com.day7.java8ProgramsPractice;

public class Student {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private String cource;
	
	private String city;
	
	private Double fees;
	
	private String dept;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", cource=" + cource + ", city=" + city
				+ ", fees=" + fees + ", dept=" + dept + "]";
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

	public String getCource() {
		return cource;
	}

	public void setCource(String cource) {
		this.cource = cource;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getFees() {
		return fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Student(Integer id, String name, String email, String cource, String city, Double fees, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.cource = cource;
		this.city = city;
		this.fees = fees;
		this.dept = dept;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

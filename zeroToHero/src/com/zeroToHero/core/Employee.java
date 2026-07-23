package com.zeroToHero.core;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String city;
	
	private String dept;
	
	private Double mobileNo;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", dept=" + dept + ", mobileNo=" + mobileNo
				+ "]";
	}

	public Employee(Integer id, String name, String city, String dept, Double mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.dept = dept;
		this.mobileNo = mobileNo;
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
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Double getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Double mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}

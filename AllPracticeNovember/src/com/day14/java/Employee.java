package com.day14.java;

public class Employee {

	private Integer eid;
	
	private String ename;
	
	private String eemail;
	
	private String city;
	
	private Double salary;
	
	private String designation;
	
	private String dept;

	public Employee(Integer eid, String ename, String eemail, String city, Double salary, String designation,
			String dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eemail = eemail;
		this.city = city;
		this.salary = salary;
		this.designation = designation;
		this.dept = dept;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEemail() {
		return eemail;
	}

	public void setEemail(String eemail) {
		this.eemail = eemail;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eemail=" + eemail + ", city=" + city + ", salary="
				+ salary + ", designation=" + designation + ", dept=" + dept + "]";
	}
	
	
}

package com.day2.java8ProgramsPractice;

public class Employee {

	private Integer empid;
	
	private String empname;
	
	private String email;
	
	private String mobileNo;
	
	private String city;
	
	private Double salary;
	
	private String dept;

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", city=" + city + ", salary=" + salary + ", dept=" + dept + "]";
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee(Integer empid, String empname, String email, String mobileNo, String city, Double salary,
			String dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.email = email;
		this.mobileNo = mobileNo;
		this.city = city;
		this.salary = salary;
		this.dept = dept;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

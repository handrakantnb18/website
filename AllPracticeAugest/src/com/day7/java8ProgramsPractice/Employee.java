package com.day7.java8ProgramsPractice;

public class Employee {

	private Integer empId;
	
	private String empName;
	
	private String email;
	
	private String dept;
	
	private String mobileNo;
	
	private Double salary;
	
	private String city;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", dept=" + dept
				+ ", mobileNo=" + mobileNo + ", salary=" + salary + ", city=" + city + "]";
	}

	public Employee(Integer empId, String empName, String email, String dept, String mobileNo, Double salary,
			String city) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.dept = dept;
		this.mobileNo = mobileNo;
		this.salary = salary;
		this.city = city;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

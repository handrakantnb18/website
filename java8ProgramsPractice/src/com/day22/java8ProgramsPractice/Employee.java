package com.day22.java8ProgramsPractice;

public class Employee {

	private Integer empId;
	
	private String empName;
	
	private String email;
	
	private String dept;
	
	private Double salary;
	
	private Long mobileNo;
	
	private String city;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", dept=" + dept + ", salary="
				+ salary + ", mobileNo=" + mobileNo + ", city=" + city + "]";
	}

	public Employee(Integer empId, String empName, String email, String dept, Double salary, Long mobileNo,
			String city) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.dept = dept;
		this.salary = salary;
		this.mobileNo = mobileNo;
		this.city = city;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}

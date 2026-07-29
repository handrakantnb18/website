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
	
	
	
}

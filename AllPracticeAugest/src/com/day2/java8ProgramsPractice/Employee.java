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
	
	
}

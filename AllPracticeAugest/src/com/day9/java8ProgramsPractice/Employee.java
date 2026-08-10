package com.day9.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private String address;
	
	private String dept;
	
	private Double salary;
	
	private String mobileNo;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", dept=" + dept
				+ ", salary=" + salary + ", mobileNo=" + mobileNo + "]";
	}
	
	
}

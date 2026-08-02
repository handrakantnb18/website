package com.zeroToHero.corejava.oopsInterface;

public class Employee {

	private Integer empid;
	
	private String empname;
	
	private String mobileNo;
	
	private  String email;
	
	private String city;
	
	private String dept;

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", mobileNo=" + mobileNo + ", email=" + email
				+ ", city=" + city + ", dept=" + dept + "]";
	}
	
	
}

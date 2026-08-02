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

	public Employee(Integer empid, String empname, String mobileNo, String email, String city, String dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.mobileNo = mobileNo;
		this.email = email;
		this.city = city;
		this.dept = dept;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	
	
}

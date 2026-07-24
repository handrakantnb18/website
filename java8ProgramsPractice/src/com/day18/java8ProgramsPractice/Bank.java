package com.day18.java8ProgramsPractice;

public class Bank {

	private Integer id;
	
	private String dept;
	
	private String name;
	
	private String mobileNo;

	@Override
	public String toString() {
		return "Bank [id=" + id + ", dept=" + dept + ", name=" + name + ", mobileNo=" + mobileNo + "]";
	}

	public Bank(Integer id, String dept, String name, String mobileNo) {
		super();
		this.id = id;
		this.dept = dept;
		this.name = name;
		this.mobileNo = mobileNo;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}

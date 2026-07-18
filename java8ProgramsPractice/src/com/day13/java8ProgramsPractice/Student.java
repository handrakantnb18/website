package com.day13.java8ProgramsPractice;

public class Student {

	private Integer sid;
	
	private String sname;
	
	private String city;
	
	private String college;

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", city=" + city + ", college=" + college + "]";
	}

	public Student(Integer sid, String sname, String city, String college) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.college = college;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

package com.day2.java8ProgramsPractice;

public class User {

	private Integer uid;
	
	private String uname;
	
	private String uemail;
	
	private Double usalary;
	
	private String mobile;
	
	private String address;

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uemail=" + uemail + ", usalary=" + usalary + ", mobile="
				+ mobile + ", address=" + address + "]";
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public Double getUsalary() {
		return usalary;
	}

	public void setUsalary(Double usalary) {
		this.usalary = usalary;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User(Integer uid, String uname, String uemail, Double usalary, String mobile, String address) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uemail = uemail;
		this.usalary = usalary;
		this.mobile = mobile;
		this.address = address;
	}
	
	
	
}

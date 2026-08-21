package com.day22.java8ProgramsPractice;

public class User {

	private Integer id;
	
	private String uname;
	
	private String email;
	
	private String address;
	
	private String country;
	
	private String mobileNo;
	
	private String gender;

	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", email=" + email + ", address=" + address + ", country="
				+ country + ", mobileNo=" + mobileNo + ", gender=" + gender + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public User(Integer id, String uname, String email, String address, String country, String mobileNo,
			String gender) {
		super();
		this.id = id;
		this.uname = uname;
		this.email = email;
		this.address = address;
		this.country = country;
		this.mobileNo = mobileNo;
		this.gender = gender;
	}
	
	
}

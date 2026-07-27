package com.day21.java8ProgramsPractice;

public class Students {

	private Integer id;
	
	private String name;
	
	private String college;
	
	private String email;
	
	private String mobileNo;
	
	private String city;

	public Students(Integer id, String name, String college, String email, String mobileNo, String city) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.email = email;
		this.mobileNo = mobileNo;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", college=" + college + ", email=" + email + ", mobileNo="
				+ mobileNo + ", city=" + city + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}

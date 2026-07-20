package com.day15.java8ProgramsPractice;

public class User {

	private Integer id;
	
	private String name;
	
	private String city;
	
	private String email;
	
	private Long mobileNo;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + ", mobileNo=" + mobileNo
				+ "]";
	}

	public User(Integer id, String name, String city, String email, Long mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
		this.mobileNo = mobileNo;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}

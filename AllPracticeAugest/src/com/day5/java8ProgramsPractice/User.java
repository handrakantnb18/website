package com.day5.java8ProgramsPractice;

public class User {

	private Integer uid;
	
	private String name;
	
	private String email;
	
	private String mobileNo;
	
	private String city;
	
	private Integer age;
	
	private String gender;

	public User(Integer uid, String name, String email, String mobileNo, String city, Integer age, String gender) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.city = city;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + ", city=" + city
				+ ", age=" + age + ", gender=" + gender + "]";
	}

	
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

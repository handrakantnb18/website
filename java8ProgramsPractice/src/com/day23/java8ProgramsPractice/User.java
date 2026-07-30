package com.day23.java8ProgramsPractice;

public class User {

	private Integer id;
	
	private String name;
	
	private String city;
	
	private Long mobileNo;
	
	private String email;
	
	private Integer age;
	
	private String gender;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", mobileNo=" + mobileNo + ", email=" + email
				+ ", age=" + age + ", gender=" + gender + "]";
	}

	public User(Integer id, String name, String city, Long mobileNo, String email, Integer age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobileNo = mobileNo;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
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

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	
	
}

package com.day21.java;

// Student Class – 8 Variables in Java

// Create a Student class with the following 8 variables:

public class Student {

	private Integer sid;

	private String name;

	private String email;

	private Integer age;

	private String gender;

	private Double marks;

	private String city;

	private String course;

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", age=" + age + ", gender=" + gender
				+ ", marks=" + marks + ", city=" + city + ", course=" + course + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
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

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	
	public Student(Integer sid, String name, String email, Integer age, String gender, Double marks, String city,
			String course) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
		this.city = city;
		this.course = course;
	}

	
}

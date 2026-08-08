package com.day6.java8ProgramsPractice;

public class Student {

	private Integer stdId;
	
	private String name;
	
	private String email;
	
	private String mobileMo;
	
	private String city;
	
	private String course;
	
	private Double marks;

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", email=" + email + ", mobileMo=" + mobileMo + ", city="
				+ city + ", course=" + course + ", marks=" + marks + "]";
	}

	public Student(Integer stdId, String name, String email, String mobileMo, String city, String course,
			Double marks) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.email = email;
		this.mobileMo = mobileMo;
		this.city = city;
		this.course = course;
		this.marks = marks;
	}

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
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

	public String getMobileMo() {
		return mobileMo;
	}

	public void setMobileMo(String mobileMo) {
		this.mobileMo = mobileMo;
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

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}
	
	
	
}

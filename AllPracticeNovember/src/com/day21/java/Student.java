package com.day21.java;

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
	
	
	

}

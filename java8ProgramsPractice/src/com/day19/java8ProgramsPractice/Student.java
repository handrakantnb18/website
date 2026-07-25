package com.day19.java8ProgramsPractice;

public class Student {

	private Integer id;
	
	 private String name;
	 
	 private String email;
	    
	 private String city;
	    
	 private Integer age;
	    
	 private String course;
	    
	 private Double percentage;

	 @Override
	 public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", age=" + age
				+ ", course=" + course + ", percentage=" + percentage + "]";
	 }

	 public Student(Integer id, String name, String email, String city, Integer age, String course, Double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.age = age;
		this.course = course;
		this.percentage = percentage;
	 }

	 public Student() {
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

	 public String getEmail() {
		 return email;
	 }

	 public void setEmail(String email) {
		 this.email = email;
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

	 public String getCourse() {
		 return course;
	 }

	 public void setCourse(String course) {
		 this.course = course;
	 }

	 public Double getPercentage() {
		 return percentage;
	 }

	 public void setPercentage(Double percentage) {
		 this.percentage = percentage;
	 }
	    
	 
	 
}

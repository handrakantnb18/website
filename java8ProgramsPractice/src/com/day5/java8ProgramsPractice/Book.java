package com.day5.java8ProgramsPractice;

public class Book {

private Integer id;
	
	private String name;
	
	private String city;
	
	private String dept;

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", city=" + city + ", dept=" + dept + "]";
	}

	public Book(Integer id, String name, String city, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.dept = dept;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	

}

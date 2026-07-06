package com.day6.java8ProgramsPractice;

public class Students {

	private Integer id;
	
	private String name;
	
	private String city;

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public Students(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Students() {
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
	
	
}

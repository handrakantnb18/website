package com.day11.java8ProgramsPractice;

public class Student {

	private Integer id;
	
	private String name;
	
	private String collage;
	
	private String address;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", collage=" + collage + ", address=" + address + "]";
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

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

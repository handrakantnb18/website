package com.day18.java8ProgramsPractice;

public class User {

	private Integer id;
	
	private String name;
	
	private String dept;
	
	private String email;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dept=" + dept + ", email=" + email + "]";
	}

	public User(Integer id, String name, String dept, String email) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.email = email;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

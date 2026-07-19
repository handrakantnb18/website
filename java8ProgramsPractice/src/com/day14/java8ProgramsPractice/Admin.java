package com.day14.java8ProgramsPractice;

public class Admin {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private String dept;

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", email=" + email + ", dept=" + dept + "]";
	}

	public Admin(Integer id, String name, String email, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}

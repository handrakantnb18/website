package com.day11.java8ProgramsPractice;

public class Book {

	private Integer id;
	
	private String name;
	
	private String dept;
	
	private String PRNnumber;

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", dept=" + dept + ", PRNnumber=" + PRNnumber + "]";
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

	public String getPRNnumber() {
		return PRNnumber;
	}

	public void setPRNnumber(String pRNnumber) {
		PRNnumber = pRNnumber;
	}

	public Book(Integer id, String name, String dept, String pRNnumber) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		PRNnumber = pRNnumber;
	}
	
	
}

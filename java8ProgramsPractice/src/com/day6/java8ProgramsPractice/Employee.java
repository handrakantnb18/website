package com.day6.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String empName;
	
	private String Dept;
	
	private String experience;

	public Employee(Integer id, String empName, String dept, String experience) {
		super();
		this.id = id;
		this.empName = empName;
		Dept = dept;
		this.experience = experience;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", Dept=" + Dept + ", experience=" + experience + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	
}

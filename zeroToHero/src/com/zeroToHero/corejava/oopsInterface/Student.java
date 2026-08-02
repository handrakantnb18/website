package com.zeroToHero.corejava.oopsInterface;

public class Student {

	private Integer id;
	
	private String name;
	
	private Double salary;
	
	private Integer experience;
	
	private String dept;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + ", experience=" + experience + ", dept="
				+ dept + "]";
	}

	public Student(Integer id, String name, Double salary, Integer experience, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.experience = experience;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}

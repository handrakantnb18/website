package com.day6.javaProgramsPractice;

public class Employee {
	
	private Integer id;
	
	private String name;
	
	private String email;
	
	private Double salary;
	
	private String city;
	
	private String desc;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", city=" + city
				+ ", desc=" + desc + "]";
	}
	
	

}

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
	
	
}

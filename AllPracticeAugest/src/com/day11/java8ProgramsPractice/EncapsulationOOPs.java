package com.day11.java8ProgramsPractice;

// Binding (or wrapping) code and data together into a single unit
// A Java bean is a fully encapsulated class because all the data
// members are private.

class Student {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

public class EncapsulationOOPs {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setName("Ram");
		
		System.out.println("Student name : "+s.getName());
		
	}
}

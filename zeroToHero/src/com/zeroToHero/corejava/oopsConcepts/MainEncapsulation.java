package com.zeroToHero.corejava.oopsConcepts;

// demonstrates encapsulation by using private data members along with public getter and setter methods.

class Student {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class MainEncapsulation {

	public static void main(String[] args) {

		Student s = new Student();
		
		s.setName("chandrakant");
		
		System.out.println("String name : "+s.getName());
		
	}
}

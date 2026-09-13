package com.day13.java8ProgramsPractice;

class EnTest {
	
	private String name;
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

public class EncapsulationTest {

	public static void main(String[] args) {
		
		EnTest et = new EnTest();
		
		EnTest et1 = new EnTest();
		
		et.setName("Chandrakant");
		et1.setName("Bhosale");
		
		System.out.println("First Name - "+et.getName());
		
		System.out.println("Last Name - "+et1.getName());
		
	}
}

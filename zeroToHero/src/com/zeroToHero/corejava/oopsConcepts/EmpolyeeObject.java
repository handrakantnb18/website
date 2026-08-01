package com.zeroToHero.corejava.oopsConcepts;

// demonstrates how to create a class, instantiate an object, assign values to object fields, and invoke a method using that object.

public class EmpolyeeObject {
	
	String name;
	
	String college;
	
	void emp() {
		System.out.println(name+ "Chandrakant :"
	+college+" SIBAR college ");
	}
	

	public static void main(String[] args) {
		
		EmpolyeeObject eo = new EmpolyeeObject();
		eo.name = "Bhosale ";
		eo.college = " Pune";
		
		eo.emp();
	}
}

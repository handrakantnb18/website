package com.day10.java8ProgramsPractice;

// Java Program to demonstrate why we need method overriding    

class Bike{
	void run() {
		System.out.println("Java Program to demonstrate why we need method overriding");
	}
}

class Vehical extends Bike{
	
	
}

public class VehicalMethodOverride {

	public static void main(String[] args) {
		
		Vehical v1 = new Vehical();
		
		//calling the method with child class instance
		v1.run();
	}
}

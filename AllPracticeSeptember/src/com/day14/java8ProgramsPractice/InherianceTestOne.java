package com.day14.java8ProgramsPractice;

// the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):

class Vehicle {
	
	protected String brand = "TATA";
	
	public void honk() {
		System.out.println("Tuut, tuut");
	}
}

public class InherianceTestOne extends Vehicle {

	private String modelName = "Truck";
	
	public static void main(String[] args) {
		
		InherianceTestOne i = new InherianceTestOne();
		
		i.honk();
		
		System.out.println(i.brand + " "+i.modelName);
		
	}
}

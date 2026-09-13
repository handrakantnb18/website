package com.day13.java8ProgramsPractice;

// Multiple Inheritance 
// one class can have more than one superclass and inherit features from all parent classes.
// Java does not support multiple inheritances with classes.

interface LandVehicle {
	default void landInfo() {
		System.out.println("This is LandVehicle.");
	}
}

interface WaterVehicle {
	default void waterInfo() {
		System.out.println("This is a WaterVehicle.");
	}
}

class AmphibiousVehicle implements LandVehicle, WaterVehicle {
	AmphibiousVehicle() {
		System.out.println("this is AmphibiousVehicle.");
	}
}

public class InheritanceTestMultiple {

	public static void main(String[] args) {
		
		AmphibiousVehicle av = new AmphibiousVehicle();
		av.waterInfo();
		av.landInfo();
		
	}
}

package com.day5.java;

// Vehicle Specification Checker- Using Record Pattern

record Cara(String brand, int speed) {
	
}

public class VehicleSpecificationChecker {

	public static void main(String[] args) {

		Object vehicleData = new Cara("Toyota", 120);

		switch (vehicleData) {
		
		case Cara(String brand, int speed) -> System.out.println("Car: " + brand + " at " + speed + " km/h");
		
		default -> System.out.println("Unsupported vehicle data");
		}

	}
}

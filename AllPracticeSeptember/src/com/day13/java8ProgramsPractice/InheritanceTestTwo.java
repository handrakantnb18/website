package com.day13.java8ProgramsPractice;

// Single Inheritance
// single inheritance, a sub-class is derived from only one super class

class Vehicle {
	 Vehicle() {
		System.out.println("This is Vehical..");
	}
}

class Car extends Vehicle {
	Car() {
		System.out.println("This vehicale is Car.");
	}
}

public class InheritanceTestTwo {

	public static void main(String[] args) {
		
		Car obj = new Car();
		
	}
}

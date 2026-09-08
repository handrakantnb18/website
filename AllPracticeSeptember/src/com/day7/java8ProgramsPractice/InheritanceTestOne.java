package com.day7.java8ProgramsPractice;

class Vehicle {
	void start() {
		System.out.println("Vehicla is starting..");
	}
	
	void stop() {
		System.out.println("Vehicle is stoping..");
	}
}

class Car extends Vehicle {
	void honk() {
		System.out.println("Car is honking..");
	}
}

public class InheritanceTestOne {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.start();
		car.stop();
		
		car.honk();
	}
}

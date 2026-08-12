package com.day11.java8ProgramsPractice;

// one object acquires all the properties and behaviors  
// of a parent object, it is known as inheritance.

class VehicalTest {
	void start() {
		System.out.println("Vehical is Starting....");
	}
	void stop() {
		System.out.println("Vehical is Stoping....");
	}
}

class Car extends VehicalTest {
	void honk() {
		System.out.println("Car is honking...");
	}
}
public class InheritanceOOPs {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.start();
		car.stop();
		
		car.honk();
	}
}

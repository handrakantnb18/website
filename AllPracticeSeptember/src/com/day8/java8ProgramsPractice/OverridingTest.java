package com.day8.java8ProgramsPractice;

class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle {
}

public class OverridingTest {

	public static void main(String[] args) {

		Bike obj = new Bike();

		obj.run();

	}
}

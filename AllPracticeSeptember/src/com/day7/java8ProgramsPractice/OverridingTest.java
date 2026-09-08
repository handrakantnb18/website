package com.day7.java8ProgramsPractice;

class Vehicle1 {

	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle1 {

	void run() {
		System.out.println("Bike is running safely");
	}
}

public class OverridingTest {

	public static void main(String[] args) {

		Bike obj = new Bike();

		obj.run();

	}
}

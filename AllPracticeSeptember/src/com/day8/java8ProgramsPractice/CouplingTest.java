package com.day8.java8ProgramsPractice;

class Engine {
	void start() {
		System.out.println("Engine started");
	}
}

class Car {
	private Engine engine;

	Car() {
		engine = new Engine();

	}

	void drive() {
		engine.start();
		System.out.println("Car is moving");
	}
}

public class CouplingTest {

	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.drive();
		
	}
}

package com.day12.java8ProgramsPractice;

// When a class inherits another class, it is known as a single inheritance

class AnimalSI {
	void eat() {
		System.out.println("eating...");
	}
}

class DogSI extends AnimalSI{
	void bark() {
		System.out.println("barking...");
	}
}

public class SingleInheritanceMain {

	public static void main(String[] args) {
		
		DogSI d = new DogSI();
		d.bark();
		d.eat();
	}
}

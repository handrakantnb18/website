package com.day31.java8ProgramsPractice;

// interface reference can point to an object of a class 
// that implements it, showing polymorphic behavior.
interface Animal {
	void eat();
	void sleep();
}

class Dog implements Animal {
	
	public void eat() {
		System.out.println("Dog is eating.");
	}
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
}


public class InterfacePolymorphismTest {

	public static void main(String[] args) {
		
		Animal myAnimal = new Dog();
		myAnimal.eat();
		myAnimal.sleep();
		
	}
}

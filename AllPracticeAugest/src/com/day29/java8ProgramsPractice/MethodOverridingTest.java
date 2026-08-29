package com.day29.java8ProgramsPractice;

// Method overriding occurs in two classes that have IS-A (inheritance) relationship.
//Number and type of parameter must be the same.
// Return type must be same or covariant.
// It is called dynamic binding or late binding.
class Animal {
	
	public void makeSound() {
		System.out.println("Animal is a sound.");
	}
}

class Dog extends Animal {
	
	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}
}

public class MethodOverridingTest {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Animal d = new Dog();
		a.makeSound();
		d.makeSound();
		
	}
}

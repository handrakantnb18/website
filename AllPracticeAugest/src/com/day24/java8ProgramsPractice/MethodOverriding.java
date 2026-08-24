package com.day24.java8ProgramsPractice;

// child class provides its own implementation of a 
// method already defined in the parent class, it is called method overriding.
class Animal {
	public void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal {
	
	public void sound() {
		System.out.println("Dog barking..");
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.sound();
	}
}

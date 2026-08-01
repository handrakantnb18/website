package com.zeroToHero.corejava.oopsConcepts;

// demonstrates polymorphism by showing method overloading at compile time and method overriding at runtime.

class Animal{
	
	void sound() {
		System.out.println("An animal makes a sound");
	}
	
	void sound(String type) {
		System.out.println("Animul sound : "+type);
	}
}

class Dog extends Animal {
	
	void sound(String type) {
		System.out.println("Dog is barking : "+type);
	}
}

public class MainPolymorphism {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Dog d = new Dog();
		Animal poly = new Dog();
		
		a.sound();
		a.sound("Generics");
		
		d.sound("Loud");
		
		poly.sound("Soft");
	}
}

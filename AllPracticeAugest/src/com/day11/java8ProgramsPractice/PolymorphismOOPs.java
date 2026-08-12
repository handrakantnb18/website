package com.day11.java8ProgramsPractice;

// If one task is performed in different ways
// polymorphism by showing method overloading at compile 
// time and method overriding at runtime.

class AnimalPoly {
	void sound() {
		System.out.println("An animal marks a sound.");
	}
	
	void sound(String type) {
		System.out.println("Animal sound : "+type);
	}
}

class DogPoly extends AnimalPoly{
	
	void sound(String type) {
		System.out.println("Dog barking is : "+type);
	}
}

public class PolymorphismOOPs {

	public static void main(String[] args) {
		
		AnimalPoly p = new AnimalPoly();
		DogPoly d = new DogPoly();
		
		AnimalPoly a = new AnimalPoly();
		
		p.sound();
		p.sound("Generic");
		
		d.sound("Loud");
		
		a.sound("Soft");
		
	}
}

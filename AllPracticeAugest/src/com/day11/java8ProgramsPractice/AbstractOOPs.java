package com.day11.java8ProgramsPractice;

// Hiding internal implementation and showing functionality only to the user 
//  we use abstract classes and interfaces to achieve abstraction.

abstract class AnimalAbstract {
	
	abstract void makeSound();
	
	void breathe() {
		System.out.println("Animal is breathing....");
	}
}

class Dogg extends AnimalAbstract{
	
	@Override
	void makeSound() {
		System.out.println("Dog is barking....");
	}
}

public class AbstractOOPs {

	public static void main(String[] args) {
		
		AnimalAbstract obj = new Dogg();
		obj.breathe();
		obj.makeSound();
	}
}

package com.day7.java8ProgramsPractice;

abstract class Animal {
	
	abstract void makeSound();
	
	void breath() {
		System.out.println("Animal is breathing...");
	}
}

class Dog extends Animal {
	
	@Override
	void makeSound() {
		 System.out.println("Dog barking");  
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		
		Animal dog = new Dog();  
		
        dog.breath();  
        
        dog.makeSound(); 
        
	}
}

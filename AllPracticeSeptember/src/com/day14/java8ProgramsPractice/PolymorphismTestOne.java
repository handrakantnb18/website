package com.day14.java8ProgramsPractice;

// create Pig and Dog objects and call the animalSound() method on both 

class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}

public class PolymorphismTestOne {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal a3 = new Animal();

		a1.animalSound();
		a2.animalSound();
		a3.animalSound();

	}
}

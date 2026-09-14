package com.day14.java8ProgramsPractice;

// Data abstraction is the process of hiding certain details
// and showing only essential information to the user.

abstract class AnimalA {

	public abstract void animalSound();

	public void sleep() {
		System.out.println("Zzz");
	}
}

class PigA extends AnimalA {
	public void animalSound() {

		System.out.println("The pig says: wee wee");
	}
}

public class InnerAbstractClassTestOne {

	public static void main(String[] args) {

		PigA p = new PigA();
		p.animalSound();
		p.sleep();
		
	}
}

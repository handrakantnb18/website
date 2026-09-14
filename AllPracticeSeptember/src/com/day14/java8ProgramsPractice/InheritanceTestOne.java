package com.day14.java8ProgramsPractice;

// An interface is a completely "abstract class" that is 
// used to group related methods with empty bodies:

interface AnimalIn {
	public void animalSound();

	public void sleep();
}

class PigIn implements AnimalIn {
	public void animalSound() {

		System.out.println("The pig says: wee wee");
	}

	public void sleep() {

		System.out.println("Zzz");
	}
}

public class InheritanceTestOne {

	public static void main(String[] args) {

		PigIn p = new PigIn();
		p.animalSound();
		p.sleep();

	}
}

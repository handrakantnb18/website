package com.day11.java8ProgramsPractice;

// the simple example of Runtime Polymorphism with multilevel inheritance.
class Animal{
	void eat() {
		System.out.println("Eating....");
	}
}

class Dog extends Animal{
	void eat() {
		System.out.println("Eating Fruits.....");
	}
}

class BabyDog extends Animal {
	void eat() {
		System.out.println("Drinking milk....");
	}
}

public class RuntimePolymorphismMultilevelInheritance {

	public static void main(String[] args) {
		
		Animal a1, a2, a3;
		
		a1 = new Animal();
		a2 = new Dog();
		a3 = new BabyDog();
		
		a1.eat();
		a2.eat();
		a3.eat();
	}
}

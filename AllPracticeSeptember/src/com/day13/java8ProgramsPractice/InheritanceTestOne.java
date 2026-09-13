package com.day13.java8ProgramsPractice;

// A subclass can reuse the fields and methods of the parent class without rewriting the code
// A subclass can add its own fields and methods or modify existing ones to extend functionality.

class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog barking..");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("Cat moves.");
	}
}

class Cow extends Animal {
	void sound() {
		System.out.println("Cow moos");
	}
}

public class InheritanceTestOne {

	public static void main(String[] args) {
		
		Animal a;
		a = new Dog();
		a.sound();
		
		a = new Cat();
		a.sound();
		
		a= new Cow();
		a.sound();
		
	}
}

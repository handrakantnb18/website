package com.day10.java8ProgramsPractice;


class Animal {
	void eat() {
		System.out.println("Eating....");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Eating bread....");
	}
	
	void bark() {
		System.out.println("barking....");
	}
	
	void work() {
		super.eat();
		bark();
	}
}

//Creating Main class to create object and call methods
public class InvokeParentMethod {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.work();
	}
}

package com.day11.java8ProgramsPractice;

// Runtime polymorphism, also known as Dynamic Method Dispatch,
// is a process in which the call to an overridden method 

// In this process, an overridden method is invoked using a 
// superclass reference variable that refers to a subclass object. 

class Bike{
	void run() {
		System.out.println("Runnning....");
	}
}

class Splendor extends Bike{
	void run() {
		System.out.println("Running safely with 50km");
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		
		Bike bk = new Splendor();
		bk.run();
	}
}

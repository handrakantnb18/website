package com.day11.java8ProgramsPractice;

//  demonstrates how to create a class, instantiate an object, assign
//  values to object fields, and invoke a method using that object.
class DogTest {
	String name;
	
	void bark() {
		System.out.println(name+" my name is Ram.");
	}
}

public class ObjectOOPs {

	public static void main(String[] args) {

		DogTest dog = new DogTest();
		dog.name ="chandraknat";
		dog.bark();
		
	}
}

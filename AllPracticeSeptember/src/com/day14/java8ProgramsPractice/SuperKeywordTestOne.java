package com.day14.java8ProgramsPractice;

// use super to access an attribute from the parent class if they have an attribute with the same name:

class AnimalS {
	String type = "Animal";
}

class DogS extends AnimalS {
	String type = "Dog";

	public void printType() {
		System.out.println(super.type); // Access parent attribute
	}
}

public class SuperKeywordTestOne {

	public static void main(String[] args) {

		DogS d = new DogS();
		d.printType();
		
	}
}

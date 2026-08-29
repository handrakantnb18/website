package com.day29.java8ProgramsPractice;

public class ThrowDemo {

	// Used to explicitly throw a single exception
	// We use throw when something goes wrong
	static void checkAge(int age) {
		
		if(age < 18) {
			throw new IllegalArgumentException("Age must be 18 or above.");
		}
		else {
			System.out.println("Age less than 18.");
		}
	}
	
	public static void main(String[] args) {
		// checkAge(19); // Age less than 18.
		checkAge(17); // Age must be 18 or above.
		
	}
}

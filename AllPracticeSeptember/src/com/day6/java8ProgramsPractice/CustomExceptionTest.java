package com.day6.java8ProgramsPractice;

public class CustomExceptionTest {

	static void validate(int age) throws InvalidAgeException {
		if(age > 18) {
			throw new InvalidAgeException("Age not valid to the vote.");
		}
		else {
			System.out.println("Welcome to vote.");
		}
	}
	public static void main(String[] args) {
		
		try {
			validate(15);
		}
		catch(InvalidAgeException ex) {
			System.out.println("Catch the exception.");
			System.out.println("An exception occured : "+ex);
		}
		
		System.out.println("Rest of the vote...");
	}
}

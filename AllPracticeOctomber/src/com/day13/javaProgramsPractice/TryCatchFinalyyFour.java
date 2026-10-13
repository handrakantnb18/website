package com.day13.javaProgramsPractice;

//  method named validate() that accepts an integer as a parameter. throwing the ArithmeticException; 

public class TryCatchFinalyyFour {

	public static void validate(int age) {
		if (age < 18) {
			
			throw new ArithmeticException("Person is not eligible to vote");
		} 
		else {
			
			System.out.println("Person is eligible to vote!!");
		}
	}

	public static void main(String[] args) {

		validate(13);
		System.out.println("rest of the code...");

	}
}

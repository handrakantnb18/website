package com.zeroToHero.exception;

import java.lang.*;

// Function to check if a person is eligible to vote or not

public class ThrowArithmaticExceptionTest2 {

	public static void validate(int age) {
		// Throw ArithmeticException if not eligible to vote  
		
		if(age < 18) {
			throw new ArithmeticException("Person is not eligible to vote");
		}
		else {
			System.out.println("Person is eligible to vote!...");
		}
	}
	
	public static void main(String[] args) {
		
		validate(13);
		// validate(19);
		System.out.println("Rest of the code....");
	}
}

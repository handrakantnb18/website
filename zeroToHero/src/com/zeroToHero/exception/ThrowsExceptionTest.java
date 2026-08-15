package com.zeroToHero.exception;

// the throws keyword with a single exception:
// the throws keyword for single and multiple exceptions.

public class ThrowsExceptionTest {

	static void checkAge(int age) throws ArithmeticException{
		if(age < 18 ) {
			throw new ArithmeticException("Not eligible to vote");
		}
		
		System.out.println("Eligible for Age..");
	}
	
	public static void main(String[] args) {
		
		try {
			checkAge(15); // Not eligible to vote
			// checkAge(19); // Eligible for Age..
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caugth : "+e.getMessage());
		}
	}
}

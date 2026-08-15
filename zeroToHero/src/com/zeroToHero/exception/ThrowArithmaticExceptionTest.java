package com.zeroToHero.exception;

// new is used to create an instance (object) of the exception class
// The error message provides context about the reason for the exception
// Exception in thread "main" java.lang.ArithmeticException: Not eligible to vote
public class ThrowArithmaticExceptionTest {

	public static void main(String[] args) {
		
		int age = 18;
		
		if(age < 18) {
			throw new ArithmeticException("Not eligible to vote");
		}
		
		System.out.println("Eligible to vote");
	}
}

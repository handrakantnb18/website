package com.day3.java17features;

// Exception in thread "main" java.lang.ArithmeticException: Not
// eligible to vote

public class ThrowsExceptionOne {

	public static void main(String[] args) {
		
		int age = 15;
		
		if(age > 15)
		{
			throw new ArithmeticException("Not Eligible to vote");
		}
		
		 System.out.println("Eligible to vote");  
	}
}

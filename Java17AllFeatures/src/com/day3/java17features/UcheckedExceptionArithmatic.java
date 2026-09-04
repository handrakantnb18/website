package com.day3.java17features;

// Exception in thread "main" java.lang.ArithmeticException: Person is

public class UcheckedExceptionArithmatic {

	public static void validate(int age) { 
		
	if(age < 18) {    
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

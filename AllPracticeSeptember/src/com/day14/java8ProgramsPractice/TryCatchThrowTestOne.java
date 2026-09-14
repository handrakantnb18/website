package com.day14.java8ProgramsPractice;

// The throw statement is used together with an exception type. There are many 
// exception types, available in Java: ArithmeticException, FileNotFoundException, 
// ArrayIndexOutOfBoundsException, SecurityException, etc:

public class TryCatchThrowTestOne {

	static void checkAge(int age) {
		if(age < 18 ) {
			throw new ArithmeticException("Access Denied - "
					+ "You must be at least 18 years old. ");
		}
		else {
			System.out.println("Access granted - You are old enough!");
		}
	}
	public static void main(String[] args) {
		
		// checkAge(19); // Access granted - You are old enough!
		
		checkAge(15); // java.lang.ArithmeticException: Access Denied 
		
	}
}

package com.day29.java8ProgramsPractice;

public class ExceptionTest {

	public static void main(String[] args) {
		
		// What will be the output for the following code?
		
		try {
			int result = 10 / 0;
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception caugth.");
		}
		catch (Exception e) {
			System.out.println("General Exception catch.");
		}
		finally {
			System.out.println("Finally block executed");
		}
	}
}

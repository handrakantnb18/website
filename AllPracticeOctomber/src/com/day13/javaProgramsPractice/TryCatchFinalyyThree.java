package com.day13.javaProgramsPractice;

// exception occurs and the catch block handles it, the finally block is executed afterward,

public class TryCatchFinalyyThree {

	public static void main(String[] args) {

		try {
			
			System.out.println("Inside the try block");
			int data = 25 / 0;
			System.out.println(data);
			
		} 
		catch (ArithmeticException e) {
			
			System.out.println("Exception handled");
			System.out.println(e);
		} 
		finally {
			
			System.out.println("Finally block is always executed");
		}
		
		System.out.println("rest of the code...");

	}
}

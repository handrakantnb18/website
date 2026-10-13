package com.day13.javaProgramsPractice;

//Java Program to demonstrate the use of finally block  

public class TryCatchFinalyyOne {

	public static void main(String[] args) {

		try {
			
			int data = 25 / 0;
			
		} catch (ArithmeticException e) {
			
			System.out.println("Exception caught: " + e);
		} finally {
			
			System.out.println("Finally block executed: Cleanup code runs here.");
		}
		
		System.out.println("Rest of the program continues...");
	}
}

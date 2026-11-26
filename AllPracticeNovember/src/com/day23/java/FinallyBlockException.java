package com.day23.java;

// The finally block is used to execute cleanup code after try and catch

public class FinallyBlockException {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3 };

		try {
			
			System.out.println(numbers[5]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught.");
		} 
		finally {
			System.out.println("Finally block executed.");
		}

		System.out.println("Program continues...");

	}
}

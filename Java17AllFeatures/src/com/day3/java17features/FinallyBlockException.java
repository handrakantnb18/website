package com.day3.java17features;

// Java Program to demonstrate the use of finally block
public class FinallyBlockException {

	public static void main(String[] args) {
		
		try
		{
			 int data = 25 / 0;
		}
		catch(ArithmeticException ex) {
			System.out.println("Exception : "+ex);
		}
		finally {
			System.out.println("Finally block ");
		}
		
		System.out.println("Rest of program contine");
	}
}

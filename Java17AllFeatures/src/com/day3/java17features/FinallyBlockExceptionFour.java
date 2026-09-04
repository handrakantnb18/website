package com.day3.java17features;

// The below code throws a divide by zero exception  
public class FinallyBlockExceptionFour {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Inside the try block");  
			
			int data=25/0;      
		    System.out.println(data);  
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception handled");
			System.out.println(ex);
		}
		finally {
			System.out.println("Finally block is always executed"); 
		}
		
		System.out.println("rest of the code...");
	}
}

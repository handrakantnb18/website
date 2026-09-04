package com.day3.java17features;

// cannot handle Arithmetic type exception can only accept a Null Pointer type exception
// The below code throws a divide by zero exception

public class FinallyBlockExceptionThree {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Inside the try block");  
			
			int data=25/0;      
		    System.out.println(data); 
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}

package com.day3.java17features;

//The below code does not throw any exception 
public class FinallyBlockExceptionTwo {

	public static void main(String[] args) {
		
		try {
			
			int data=25/5;      
		       System.out.println(data); 
		       
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Finally always block");
		}
		
		System.out.println("Rest of the code..");
	}
}

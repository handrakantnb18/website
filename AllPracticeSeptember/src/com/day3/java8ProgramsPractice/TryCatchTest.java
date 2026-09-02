package com.day3.java8ProgramsPractice;

// demonstrates how a divide by zero scenario is handled using a try-catch block.

public class TryCatchTest {

	public static void main(String[] args) {
		
		 try {  
	            int dividend = 10;  
	            int divisor = 0;  
	            int result = dividend / divisor;   
	            System.out.println("Result: " + result);  
	        } catch (ArithmeticException e) {  
	            System.out.println("Error: Division by zero is not allowed.");  
	        }  
	  
	        System.out.println("Program continues after exception handling.");  
	 
	}
}

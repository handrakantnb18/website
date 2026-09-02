package com.day3.java8ProgramsPractice;

public class TryCatchTestTwo {

	public static void main(String[] args) {
		
		 try {  
	            int[] numbers = {1, 2, 3};  
	            System.out.println("Outer try block starts");  
	  
	            try {  
	                // Inner try block  
	                int result = numbers[1] / 0; // May throw ArithmeticException  
	            } catch (ArithmeticException e) {  
	                System.out.println("Inner catch: Arithmetic Exception occurred");  
	            }  
	  
	            // Code that may throw another exception  
	            System.out.println(numbers[5]); // May throw ArrayIndexOutOfBoundsException  
	  
	        } catch (ArrayIndexOutOfBoundsException e) {  
	            System.out.println("Outer catch: Array Index Out Of Bounds Exception occurred");  
	        }  
	  
	        System.out.println("Program continues after nested exception handling.");  
	}
}

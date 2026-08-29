package com.day29.java8ProgramsPractice;

public class ExceptionTryCatchtest {

	public static void main(String[] args) {
		
		int num1 = 10; 
		int num2 = 0;
		
		// The try block contains code that might throw an exception,
		// Error: Divided by 0
		try
		{
			int num3 = num1 / num2;
			System.out.println("Division : "+num3);
		}
		catch(ArithmeticException ex) {
			System.out.println("Error: Divided by 0 !");
		}
	}
}

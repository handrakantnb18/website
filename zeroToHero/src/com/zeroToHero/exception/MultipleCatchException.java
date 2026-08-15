package com.zeroToHero.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultipleCatchException {
	//Java Program to illustrate handling multiple exceptions 
	
	public static void main(String[] args) {
		
		try {
			
			int[] num1 = {1,2,3,4,5};
			System.out.println(num1[10]);
			
			String str = "abc";
			int num2 = Integer.parseInt(str);
			
			FileReader file = new FileReader("text.txt");
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds");
		}catch(NumberFormatException e) {
			System.out.println("Invalid number format.");
		}catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}catch(Exception e) {
			System.out.println("An unexpected exception occurred");
		}
		
		System.out.println("Counting after handling exception");
	}
}

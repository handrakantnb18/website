package com.day29.java8ProgramsPractice;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		
		// one try-catch block inside another to handle 
		// exceptions at multiple levels.
		try {
			System.out.println("Outer try block.");
			
			try {
				int a= 10 / 0; // this causes arthmaticException
			}
			catch(ArithmeticException e) {
				System.out.println("Inner catch : "+e);
			}
			
			String str = null;
			System.out.println(str.length());
			
		}
			catch(NullPointerException ex) {
				System.out.println("Outer catch : "+ex);
			}
		}
	}

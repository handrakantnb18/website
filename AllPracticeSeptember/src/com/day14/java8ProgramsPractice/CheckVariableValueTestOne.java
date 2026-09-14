package com.day14.java8ProgramsPractice;

// If something unexpected happens, print out the values of your variables:

public class CheckVariableValueTestOne {

	public static void main(String[] args) {
		
		// int age = 17; // Access Denied
		
		int age = 25; // Access Granted
		System.out.println("Age : "+age);
		
		if(age >= 18)
		{
			System.out.println("Access Granted");
		}
		else {
			System.out.println("Access Denied");
		}
		
	}
}

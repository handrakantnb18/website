package com.day14.java8ProgramsPractice;

public class StringImmutableTest {

	public static void main(String[] args) {
		
		String originalStr = "Java";
		System.out.println("Original String : "+originalStr);
		
		String modifiedStr = originalStr.concat(" Programming");
		
		System.out.println("After modification, original String : "+originalStr);
		
		// The result of the modification attempt is stored in a new string  
		System.out.println("Modified String : "+modifiedStr);
		
		 // Demonstrating further that the original string is immutable 
		originalStr.toUpperCase();
		
		System.out.println("After calling toUpperCase on original String : "+originalStr);
		
		String upperCaseString = originalStr.toUpperCase();
		
		System.out.println("Original string in uppercase : "+upperCaseString);
		
		
	}
}

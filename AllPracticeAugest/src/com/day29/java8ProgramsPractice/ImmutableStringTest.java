package com.day29.java8ProgramsPractice;

// Java String Immutability
// It means that its value cannot be changed once a String object is created.
// The original string remains unchanged

public class ImmutableStringTest {

	public static void main(String[] args) {
		
		String originalString = "Nana";
		System.out.println("Original String : "+originalString);
		
		//modify the original string 
		String modifiedString = originalString.concat(" Bhosale");
		
		// Showing that the original string remains unchanged 
		System.out.println("Modified String "+modifiedString);
	
		originalString.toUpperCase();
		
		System.out.println("toUppercase String after : "+originalString);
		
		// Correct way to use the result of a string operation 
		String upperCaseString = originalString.toLowerCase();
		
		System.out.println("Original String in upper : "+upperCaseString);
		
		
	}
}

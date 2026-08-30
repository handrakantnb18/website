package com.day30.java8ProgramsPractice;

public class ReverseStringStringBuilderFive {

	// Java StringBuilder class provide a built-in reverse() method
	// that efficiently reverses the characters of a string
	public static void main(String[] args) {
		
		String originalString = "SANGLI MAHARASHTRA INDIA";
		
		// Creating an object of the string builder class
		StringBuilder sb = new StringBuilder();
		// Appending elements of originalString in sb
		sb.append(originalString); 
		sb.reverse(); // reverse StringBuilder sb 
		
		System.out.println("Original String : "+originalString);
		   // displaying reversed String  
		System.out.println("Reverse String : "+sb);
	}
}

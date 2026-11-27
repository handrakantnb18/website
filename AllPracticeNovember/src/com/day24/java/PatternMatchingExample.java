package com.day24.java;

// Bonus Java 17 feature for Backend Development: Pattern Matching with instanceof

public class PatternMatchingExample {

	
	public static void main(String[] args) {

		Object obj = "shivdatta chandrakaant bhosalet";

		if (obj instanceof String str) {

			System.out.println(str.toUpperCase());
			
			System.out.println(str.length());
		}

		// Java 17 simplifies type checking and casting.
		
		if (obj instanceof String) {
			
		    String str = (String) obj;
		    
		    System.out.println(str.toUpperCase());
		}
		
		
	}
}

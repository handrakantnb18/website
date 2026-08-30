package com.day30.java8ProgramsPractice;

// First, remove the first character from the string and append that 
// character at the end of the string
// Repeat the above step until the input string becomes empty.

public class ReverseStringRecursionThree {

	public static void main(String[] args) {
		
		String original = "MY NAME IS CHANDRAKANT";
		String reversed = reverseString(original);
		System.out.println("Original String : "+original);
		System.out.println("Reverse String :"+reversed);
		
	}
	
	public static String reverseString(String str ) {
		
		if(str == null || str.length() <= 1) {
			return str;
		}
		
		//Recursive call: reverse the substring excluding the first
		// character and append the first character at the end
		return reverseString(str.substring(1)) + str.charAt(0);
		
	}
}

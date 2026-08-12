package com.day12.java8ProgramsPractice;

// You can reverse a string in Java by iterating through it from  
// the last character to the first and building a new string.
public class ReverseStringIterator {

	public static void main(String[] args) {
		
		String str = "Hello";
		String rev = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		
		System.out.println("Original String : "+str);
		System.out.println("Reversed String : "+rev);
		
	}
}

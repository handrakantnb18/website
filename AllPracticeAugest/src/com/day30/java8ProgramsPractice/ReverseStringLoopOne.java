package com.day30.java8ProgramsPractice;

// This new string is the reversed string
// Concatenate each character to the reversed string    
// Print the original and reversed strings    

public class ReverseStringLoopOne {

	public static void main(String[] args) {
		
		String input = "CHANDRAKANT BHOSALE";
		
		String rev = "";
		
		for(int i = input.length() - 1; i>= 0; i--)
		{
			rev += input.charAt(i);
		}
		
		System.out.println("Original String : "+input);
		System.out.println("Reverse String : "+rev);
		
	}
}

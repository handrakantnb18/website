package com.day30.java8ProgramsPractice;

// Reversing a string using an array can be done by converting the string
// into a character array and then swapping the characters in place.
public class ReverseStringCharArrayFour {

	public static void main(String[] args) {
		
		String original = "MY NAME IS SHIVARAJ PRIYANKA "
				+ "CHANDRAKANT BHOSALE";
		String rev = ReverseString(original);
		System.out.println("Original String : "+original);
		System.out.println("ReversedString : "+rev);
		
	}
	public static String ReverseString(String str) {
		if(str == null || str.isEmpty()) {
			return str; // Handle empty or null strings
		}
		
		// Convert the string to a character array 
		char[] charArray = str.toCharArray();
		int left = 0,
		right = charArray.length - 1;
		
		// Swap characters from both ends of the array  
		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left = left + 1;
			right = right -1;
		}
		
		 // Convert the character array back to a string 
		return new String(charArray);
	}
}

package com.day30.java8ProgramsPractice;

// use the while loop for reversing the string.
// Method to reverse a string 
// Call the reverseString() method to get the reversed string

public class ReverseStringWhileLoopTwo {

	public static String revString(String input) {

		int length = input.length();

		String revString = "";

		int index = length - 1;

		while (index >= 0) {
			revString += input.charAt(index);

			index--;

		}

		return revString;
	}

	public static void main(String[] args) {

		String input = "chandrakant";
		String rev = revString(input);

		System.out.println("Original String : " + input);
		System.out.println("Reverse String : " + rev);
	}

}

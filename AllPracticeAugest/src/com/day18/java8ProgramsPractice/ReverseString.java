package com.day18.java8ProgramsPractice;

public class ReverseString {

	public static void main(String[] args) {
		
		// Reverse String for given word
		String str = "chandrakant";
		
		String rev = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		
		System.out.println(rev);
	}
}

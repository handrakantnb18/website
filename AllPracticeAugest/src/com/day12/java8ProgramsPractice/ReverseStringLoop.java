package com.day12.java8ProgramsPractice;

// String concatenation inside a loop creates many temporary
//  objects. Using a character array is more efficient:
public class ReverseStringLoop {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		char[] rev = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			rev[i] = str.charAt(str.length() - 1 - i);
			
		}
		
		System.out.println(new String(rev));
		
	}
}

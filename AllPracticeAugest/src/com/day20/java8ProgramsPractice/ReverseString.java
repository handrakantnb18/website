package com.day20.java8ProgramsPractice;

//without built-in reverse method
public class ReverseString {

	public static void main(String[] args) {
		
		String str = "chandrakant";
		String rev = "";
		
		for(int i = str.length() - 1; i>= 0; i--) {
			rev += str.charAt(i);
		}
		
		System.out.println(rev);
	}
}

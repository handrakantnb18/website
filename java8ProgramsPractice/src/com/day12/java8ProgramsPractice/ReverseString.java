package com.day12.java8ProgramsPractice;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		// Reverse a String
		String str = "chandrakant";
		
		String rev =
		Arrays.stream(str.split(""))
		.reduce("", (a, b) -> b+a);
		
		System.out.println(rev);
	}
}

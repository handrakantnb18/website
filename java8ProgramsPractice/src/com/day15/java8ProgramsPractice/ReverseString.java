package com.day15.java8ProgramsPractice;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "I am from sangli";
		
		String rev = 
				Arrays.stream(str.split(""))
				.reduce("", (a,b) -> b+a);
		
		System.out.println(rev);
	}
}

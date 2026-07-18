package com.day13.java8ProgramsPractice;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "chandrakant bhosale";
		
		String rev =
				Arrays.stream(str.split(""))
				.reduce("", (a, b) -> b+a);
		
		System.out.println(rev);
		
		String str1 = "priyanka";
		
		String rev1 = 
				Arrays.stream(str1.split(""))
				.reduce("", (x,y) -> y+x);
		
		System.out.println(rev1);
		
	}
}

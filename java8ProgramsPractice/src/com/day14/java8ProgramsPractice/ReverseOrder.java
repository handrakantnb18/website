package com.day14.java8ProgramsPractice;

import java.util.Arrays;

public class ReverseOrder {

	public static void main(String[] args) {
		
		String str = "chandrakant bhosale";
		
		String rev = 
				Arrays.stream(str.split(""))
				.reduce("", (a,b) -> b+a);
		
		
		System.out.println(rev);
	}
}

package com.day16.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "chandrakant bhosale";
		
		String rev =
				Arrays.stream(str.split(""))
				.reduce("", (a,b) -> b+a);
		
		System.out.println(rev);
		
	}
}

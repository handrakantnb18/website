package com.day16.java8ProgramsPractice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringStream {

	public static void main(String[] args) {
		
		// Reverse String using Stream API — Java 8
		String str = "chandrakant";
		
		String reverse = 
				IntStream.range(0, str.length())
				.mapToObj(i -> str.charAt(str.length() - 1 - i))
				.map(String::valueOf)
				.collect(Collectors.joining());
		
		System.out.println("Original String : "+str);
		System.out.println("Reverse String : "+reverse);
		
	}
}

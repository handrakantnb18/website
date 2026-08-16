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
		
		// Java 8 concepts used: IntStream, mapToObj(), Collectors.joining().
		
		String rev =
				IntStream.range(0, str.length())
				.mapToObj(i -> String.valueOf(str.charAt(str.length() - 1 - i)))
				.collect(Collectors.joining());
		
		System.out.println(rev);
		
		
	}
}

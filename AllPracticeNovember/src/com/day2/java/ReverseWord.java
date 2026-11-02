package com.day2.java;

import java.util.Arrays;
import java.util.stream.Collectors;

// Reverse each word of a string 

public class ReverseWord {

	public static void main(String[] args) {

		String str = "Java and Spring Boot Concept Of The Day";

		String reversedStr = 
				Arrays.stream(str.split(" "))
				.map(word -> new StringBuffer(word)
						.reverse())
				.collect(Collectors.joining(" "));

		System.out.println(reversedStr);

	}
}

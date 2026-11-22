package com.day20.java;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Write a Java 8 program to reverse a given string using the Stream API.

public class ReverseStringCheck {

	public static void main(String[] args) {

		String str = "Java Programming";

		String reversed = IntStream.range(0, str.length())
				.mapToObj(i -> str.charAt(str.length() - 1 - i))
				.map(String::valueOf)
				.collect(Collectors.joining());

		System.out.println("Original String: " + str);

		System.out.println("Reversed String: " + reversed);

	}
}

package com.day13.java;

// Using Java 8 Write a Java program to reverse a given string.

public class ReverseStringThree {

	public static void main(String[] args) {

		String str = "Priyanka";

		String reverse = 
				str.chars()
				.mapToObj(c -> (char) c)
				.collect(StringBuilder::new, 
						StringBuilder::append, 
						StringBuilder::append)
				.reverse()
				.toString();

		System.out.println(reverse);

	}
}

package com.day4.java;

// Parse Inputs Based on Format– Using conditional checks & ‘when’ keyword in case labels

public class InputParser {

	public static String parseInput(Object input) {
		return switch (input) {
		case String s when s.contains("@") && 
		s.contains(".") -> "Valid Email";
		case String s when s.matches("\\d{10}") ->
		"Valid Phone Number";
		default -> "Invalid Email or Phone Number";
		};
	}

	public static void main(String[] args) {

		System.out.println(parseInput("user@example.com"));
		System.out.println(parseInput("1234567890"));
		System.out.println(parseInput("invalid_input"));

	}
}

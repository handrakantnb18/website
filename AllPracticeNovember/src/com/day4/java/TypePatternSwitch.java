package com.day4.java;

// Using Type Patterns in Switch

public class TypePatternSwitch {

	public static String categorize(Object obj) {

		return switch (obj) {
		case Number n -> "Number: " + n;
		case String s -> "String: " + s;
		default -> "Unknown type.";
		};
	}

	public static void main(String[] args) {

		System.out.println(categorize(42));
		System.out.println(categorize("Java 17"));
		System.out.println(categorize(true));

	}
}

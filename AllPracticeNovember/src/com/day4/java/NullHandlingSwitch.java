package com.day4.java;

// Handling Null in Type Patterns

public class NullHandlingSwitch {

	public static void handleObject(Object obj) {

		switch (obj) {
		case null -> System.out.println("It's null.");
		case String s -> System.out.println("String: " + s);
		case Integer i -> System.out.println("Integer: " + i);
		default -> System.out.println("Unknown type.");
		}
	}

	public static void main(String[] args) {

		handleObject(null);
		handleObject("Java 17");
		handleObject(100);

	}
}

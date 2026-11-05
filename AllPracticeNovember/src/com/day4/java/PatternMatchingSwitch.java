package com.day4.java;

// Variable Patterns in Switch

public class PatternMatchingSwitch {

	public static void identifyObject(Object obj) {

		switch (obj) {
		case Integer i -> System.out.println("It's an Integer: " + i);
		case String s -> System.out.println("It's a String: " + s);
		default -> System.out.println("Unknown type.");
		}
	}

	public static void main(String[] args) {

		identifyObject(10);
		identifyObject("Hello, chandrakant");
		identifyObject(3.14);

	}
}

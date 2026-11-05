package com.day4.java;

// Java 17 features Write a program that determines whether a year is a leap year

public class PaymentProcessor {

	public static String checkYear(Number year) {
		return switch (year) {
		case Integer y -> 
		(y % 4 == 0 && y % 100 != 0) || 
		(y % 400 == 0) ? "Leap Year" : "Common Year";
		default -> "Invalid Year";
		};
	}

	public static void main(String[] args) {

		System.out.println(checkYear(2000));
		System.out.println(checkYear(1900));
		System.out.println(checkYear(2024));

	}

}

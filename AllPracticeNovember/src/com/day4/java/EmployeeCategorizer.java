package com.day4.java;

// Categorize Employees by Age– Using conditional checks in case labels

public class EmployeeCategorizer {

	public static String categorizeEmployeeAge(Number age) {
		return switch (age) {
		case Integer i when i >= 15 && i < 25 -> "Youth Employee";
		case Integer i when i >= 25 && i <= 50 -> "Mid level Employee";
		case Integer i when i > 50 && i <= 65 -> "Senior Employee";
		default -> "Invalid Age for Employment";
		};
	}

	public static void main(String[] args) {

		System.out.println(categorizeEmployeeAge(22));
		System.out.println(categorizeEmployeeAge(35));
		System.out.println(categorizeEmployeeAge(60));
		System.out.println(categorizeEmployeeAge(80));

	}
}

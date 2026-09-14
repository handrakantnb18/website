package com.day14.java8ProgramsPractice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// can use the DateTimeFormatter class with the ofPattern() method in the same 
// package to format or parse date-time objects

public class LocalTimeDateTestThree {

	public static void main(String[] args) {

		LocalDateTime lo = LocalDateTime.now();
		System.out.println("Before formatting : " + lo);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("DD-MM-YYYY HH:MM:SS");

		String formter = lo.format(df);
		System.out.println("After formatting  : " + formter);

	}
}

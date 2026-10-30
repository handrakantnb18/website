package com.day30.javaProgramsPractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// What is the new Date and Time API in Java 8

public class DateTimeExamTen {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = 
				DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Today: " + today.format
				(formatter));

	}
}

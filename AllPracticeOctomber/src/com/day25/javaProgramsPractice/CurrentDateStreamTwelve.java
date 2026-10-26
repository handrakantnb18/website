package com.day25.javaProgramsPractice;

// 12. How will you get the current date and time using Java 8 Date and Time API?

public class CurrentDateStreamTwelve {

	public static void main(String[] args) {

		System.out.println("Current Local Date: " + java.time.LocalDate.now());
		
		System.out.println("Current Local Time: " + java.time.LocalTime.now());
		
		System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());

	}
}

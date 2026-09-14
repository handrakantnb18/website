package com.day14.java8ProgramsPractice;

import java.time.LocalDate;
import java.time.LocalTime;

// display the current time (hour, minute, second, 
// and nanoseconds), import the java.time.LocalTime 
// class, and use its now() method:

public class LocalTimeDateTestOne {

	public static void main(String[] args) {
		
		LocalTime l = LocalTime.now();
		System.out.println(l);
		
	}
}

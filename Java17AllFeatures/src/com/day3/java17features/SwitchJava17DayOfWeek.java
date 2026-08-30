package com.day3.java17features;

public class SwitchJava17DayOfWeek {

	public static String getDayOfWeek(int dayNum) {
		return switch (dayNum) {
		
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "Invalid day";
		};
	}
	
	public static void main(String[] args) {
		
		System.out.println(getDayOfWeek(1));
		System.out.println(getDayOfWeek(5));
		System.out.println(getDayOfWeek(7));
		System.out.println(getDayOfWeek(10));
		
	}
}

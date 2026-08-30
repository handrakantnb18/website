package com.day3.java17features;

// Each case specifies the value of the day to match, and the 
// lambda expression after the arrow ' -> ' specifies 
public class PatternLambdaFeaturs17 {

	public static void main(String[] args) {
		
		int day = 4;
		
		switch (day) {
		
		case 1 -> System.out.println("Monday");
		
		case 2 -> System.out.println("Tuesday");
		
		case 3 -> System.out.println("Wednesday");
		
		case 4 -> System.out.println("Thursday");
		
		case 5 -> System.out.println("Friday");
		
		case 6 -> System.out.println("Saturday");
		
		case 7 ->System.out.println("Sunday");
		
		default -> System.out.println("Invalid day");
		
		}
	}
}

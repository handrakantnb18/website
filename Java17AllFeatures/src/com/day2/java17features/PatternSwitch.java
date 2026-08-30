package com.day2.java17features;

// Makes switch statements more concise and type-safe.
//Pattern Matching for switch

public class PatternSwitch {

	static String formatter (Object obj) {
	
		return switch(obj){
		case Integer i -> "Integer: "+i;
		case String s -> "String: "+s;
		default -> "Unknown";
		};
	}
	public static void main(String[] args) {
		
		PatternSwitch p = new PatternSwitch();
		
		System.out.println(p.formatter(100));
		System.out.println(p.formatter("Chandrakant"));
		System.out.println(p.formatter(10.50));
		
	}
}

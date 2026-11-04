package com.day3.java;

import java.util.Optional;

// equals() method of the Optional class is used to compare two Optional objects for equality.

public class OptionalObject {

	public static void main(String[] args) {
		
		Optional<String> opt1 = Optional.of("Chandr");
        Optional<String> opt2 = Optional.of("Chandr");
        Optional<String> opt3 = Optional.of("Priya");
        Optional<String> opt4 = Optional.of("Priya");
        Optional<String> opt5 = Optional.of("Ram");
        
        System.out.println(opt1.equals(opt2));
        System.out.println(opt1.equals(opt3));
        System.out.println(opt3.equals(opt4));
        System.out.println(opt1.equals(opt5));
        
	}
}

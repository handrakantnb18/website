package com.day2.java;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// Find sum of all digits of a number

public class SumOfAllDigits {

	public static void main(String[] args) {
		
		int i = 89715623;
        
        Integer sumOfDigits = 
        		Stream.of(String.valueOf(i)
        				.split(""))
        		.collect(Collectors.summingInt
        				(Integer::parseInt));
         
        System.out.println(sumOfDigits);
        
	}
}

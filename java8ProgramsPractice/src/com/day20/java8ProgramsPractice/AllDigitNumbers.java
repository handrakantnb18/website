package com.day20.java8ProgramsPractice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllDigitNumbers {

	public static void main(String[] args) {
		
		 int i = 156231;
         
	        Integer sumOfDigits = 
	        		Stream.of(String.valueOf(i)
	        				.split(""))
	        		.collect(Collectors.summingInt
	        				(Integer::parseInt));
	         
	        System.out.println(sumOfDigits);
	}
}

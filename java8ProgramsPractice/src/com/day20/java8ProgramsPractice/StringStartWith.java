package com.day20.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class StringStartWith {

	public static void main(String[] args) {
		
        List<String> list = Arrays.asList
        ("One", "2wo", "3hree", "Four", "5ive", "Six");
        
        list.stream()
        .filter(str -> Character.isDigit
        		(str.charAt(0)))
        .forEach(System.out::println);
        
	}
}

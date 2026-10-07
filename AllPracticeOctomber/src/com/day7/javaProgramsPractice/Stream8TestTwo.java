package com.day7.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;

// They are lazy, meaning processing generally begins 
// only when a terminal operation is invoked.

public class Stream8TestTwo {

	public static void main(String[] args) {
		
		List<Integer> numbers
        = Arrays.asList(5, 10, 20, 10, 30, 40);

    numbers.stream()
        .filter(n -> n > 10)
        .map(n -> n * 2)
        .distinct()
        .sorted()
        .forEach(System.out::println);
    
	}
}

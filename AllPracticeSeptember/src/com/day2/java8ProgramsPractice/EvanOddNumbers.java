package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvanOddNumbers {

	// Find even and odd numbers from a list
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6,7,8,9,10,11,12,
				13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33);
		
		List<Integer> evenNumbers = numbers.stream()
		        .filter(n -> n % 2 == 0)
		        .collect(Collectors.toList());

		System.out.println("Even Numbers : "+evenNumbers);
		
		List<Integer> oddNumbers = numbers.stream()
		        .filter(n -> n % 2 != 0)
		        .collect(Collectors.toList());

		System.out.println("Odd Numbers : "+oddNumbers);
		
	}
}

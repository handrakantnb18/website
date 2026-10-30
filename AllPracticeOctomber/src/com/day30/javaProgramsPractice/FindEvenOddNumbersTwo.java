package com.day30.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Find all even and Odd numbers from a list

public class FindEvenOddNumbersTwo {

	public static void main(String[] args) {

		List<Integer> list = 
				Arrays.asList(55, 85, 99, 56, 10, 15, 
						8, 49, 25, 98, 32);
		
		List<Integer> evenNumbers = 
				list.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());

		System.out.println(evenNumbers);
		
		List<Integer> oddNumbers = 
				list.stream()
				.filter(n -> n % 2 != 0)
				.collect(Collectors.toList());
		
		System.out.println(oddNumbers);
		
	}
}

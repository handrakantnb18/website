package com.day3.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class EvenOddNumbers {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10,
				11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26);
		
		System.out.println("Even Numbers : ");
		num.stream()
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
		
		System.out.println("Odd Numbers : ");
		num.stream()
		.filter(n -> n % 2 != 0)
		.forEach(System.out::println);
		
		
	}
}

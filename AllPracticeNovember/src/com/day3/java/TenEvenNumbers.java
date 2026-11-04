package com.day3.java;

import java.util.stream.IntStream;

// Print first 10 even numbers

public class TenEvenNumbers {

	public static void main(String[] args) {

		IntStream.rangeClosed(1, 10)
		.map(i -> i * 2)
		.forEach(System.out::println);

		IntStream.rangeClosed(1, 10)
		.map(i -> i * 4)
		.forEach(System.out::println);
	
	}
}

package com.day20.java8ProgramsPractice;

import java.util.stream.IntStream;

public class TenEvenNumbers {

	public static void main(String[] args) {
		
		IntStream
		.rangeClosed(1, 10)
		.map(i -> i * 2)
		.forEach(System.out::println);
		
	}
}

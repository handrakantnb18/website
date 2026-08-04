package com.day3.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumberStream {

	// Filter Even Numbers
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				10,15,20,25,30,35,40,45,50);
		
		list.stream()
		.filter(s -> s % 2 == 0)
		.forEach(System.out::println);
	}
}

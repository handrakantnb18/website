package com.day3.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class ParallerStreamSet {

	// no sequence for the order list
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				11,12,13,14,15,16,17,18,19);
		
		list.stream()
		.parallel()
		.forEach(System.out::println);
		
	}
}

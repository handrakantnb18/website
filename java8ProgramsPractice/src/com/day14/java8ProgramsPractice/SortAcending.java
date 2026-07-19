package com.day14.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAcending {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				25,64,29,37,88,92,13,46,5);
		
		num.stream()
		.sorted()
		.forEach(System.out::println);
	
	}
}

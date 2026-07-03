package com.day3.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class OddNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,
				10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25);
		
		list.stream()
		.filter(o -> o % 2 != 0)
		.forEach(System.out::println);
	}
}

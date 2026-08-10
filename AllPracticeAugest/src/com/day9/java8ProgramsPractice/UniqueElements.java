package com.day9.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				10,15,15,20,35,30,35);
		
		List<Integer> uni =
				list.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(uni);
	}
}

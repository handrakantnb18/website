package com.day8.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMinNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				12,55,78,93,46,55,79,35,99,91);
		
		Integer  max =
		list.stream()
		.max(Collections.reverseOrder())
		.get();
		
		System.out.println(max);
		
		Integer min =
		list.stream()
		.min(Collections.reverseOrder())
		.get();
		
		System.out.println(min);
	}
}

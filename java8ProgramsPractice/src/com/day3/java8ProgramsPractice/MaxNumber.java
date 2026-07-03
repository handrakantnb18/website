package com.day3.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				45,65,98,7,55,26,54,77,88,2,35,46);
		
		Integer max =
				list.stream()
				.max(Integer::compare)
				.get();
				
				System.out.println(max);
		
	}
}

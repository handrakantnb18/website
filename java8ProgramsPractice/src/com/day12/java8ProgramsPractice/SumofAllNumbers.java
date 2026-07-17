package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class SumofAllNumbers {

	// Sum of All Numbers
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				88,77,99,66,55,44,33,22,11);
		
		Integer sum =
				list.stream()
				.mapToInt(Integer::intValue)
				.sum();
				
		System.out.println(sum);
	}
}

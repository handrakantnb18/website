package com.day10.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				10,22,25,35,7,8,95,55,70);
		
		Integer min =
			list.stream()
			.min(Integer::compare)
			.get();
			
			System.out.println("Minimum Number : "+min);
		
	}
}

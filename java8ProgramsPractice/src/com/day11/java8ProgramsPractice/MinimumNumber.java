package com.day11.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MinimumNumber {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(
				10,22,25,35,7,8,95,55,70);
		
		Integer max =
			list.stream()
			.max(Integer::compare)
			.get();
			
			System.out.println("Max Number : "+max);
		
			
	}
}

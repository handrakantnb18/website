package com.day22.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class SecondLowest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList
				(88,5,78,98,65,25,33,2,12,33,58);
		
		Integer lowest = 
				list.stream()
				.distinct()
				.sorted()
				.skip(3)
				.findFirst()
				.get();
		
		System.out.println(lowest);
	}
}

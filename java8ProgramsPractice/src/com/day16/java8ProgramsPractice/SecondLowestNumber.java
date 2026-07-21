package com.day16.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class SecondLowestNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,95,32,15,4,65,12,15,14,16,58,34,79);
	
		Integer lowest = 
					list.stream()
					.distinct()
					.sorted()
					.skip(2)
					.findFirst()
					.get();
		
		System.out.println(lowest);
		
	}
}

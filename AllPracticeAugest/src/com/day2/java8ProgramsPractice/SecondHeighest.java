package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHeighest {

	// find second Highest in the list
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(78,99,65,25,45,34,91,29);
		
		Integer high =
				list.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(high);
		
	}
}

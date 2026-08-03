package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNum {

	// find Duplicate Integer in the list
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,25,45,8,5,2,45,5);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(s -> !set.add(s))
		.forEach(System.out::println);
		
	}
}

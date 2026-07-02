package com.day1.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		
		// Count Even and Odd Numbers
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,
				10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25);
		
		Map<Boolean, List<Integer>> map = 
				list.stream()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));
		
		System.out.println("Even Numbers : "+map.get(true).size());
		System.out.println("Odd Numbers : "+map.get(false).size());
		
	}
}

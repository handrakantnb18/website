package com.day26.javaProgramsPractice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

// Q1: Given a list of integers, find all numbers that start with the digit '1'.

public class ListArrayTestOne {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 23, 15, 8, 113, 45);
		
		List<String> result = list.stream()
		    .map(Objects::toString)
		    .filter(s -> s.startsWith("1"))
		    .collect(Collectors.toList());		
	}
}

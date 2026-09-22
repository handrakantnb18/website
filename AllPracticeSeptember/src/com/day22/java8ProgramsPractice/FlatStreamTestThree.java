package com.day22.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// map() when you want to convert a list of items into a new list of 
// the same size where each item is modified individually


public class FlatStreamTestThree {

	public static void main(String[] args) {
		
		 List<String> names = Arrays.asList("alice", "bob", "charlie");
		 
		 List<String> upper = names.stream()
	                .map(String::toUpperCase)
	                .collect(Collectors.toList());

	        System.out.println(upper); 
	        
	}
}

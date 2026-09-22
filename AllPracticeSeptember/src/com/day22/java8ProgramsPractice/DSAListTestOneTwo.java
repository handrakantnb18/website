package com.day22.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Java provides both linear search and binary search

public class DSAListTestOneTwo {

	public static void main(String[] args) {
		
		 List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
	        int key = 6;
	        
	        System.out.println("Linear Search: " + list.contains(key));

	        int index = Collections.binarySearch(list, key);
	        if (index >= 0) {
	            System.out.println("Element found at index " + index);
	        } else {
	            System.out.println("Element not found");
	        }
	}
}

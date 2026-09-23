package com.day22.java8ProgramsPractice;

import java.util.*;

// Sorting arranges elements in ascending or descending order

public class DSAListTestThree {

	public static void main(String[] args) {
		
		int[] nums = {5, 3, 8, 1};
        Arrays.sort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 1));
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
        
	}
}

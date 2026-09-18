package com.day18.java8ProgramsPractice;

import java.util.HashSet;

// Using Hash Set - Works for Unsorted Also - O(n) Time and O(n) Space

public class RemoveDuplicatesTestOne {

	static int removeDuplicates(int[] arr) {
		
		HashSet<Integer> s = new HashSet<>();
		
		int idx = 0;  

        for (int i = 0; i < arr.length; i++) {
            if (!s.contains(arr[i])) { 
                s.add(arr[i]);  
                arr[idx++] = arr[i];  
            }
        }
        
        return idx;
        
	}
	
	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		int newSize = removeDuplicates(arr);

		for (int i = 0; i < newSize; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}

package com.day19.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// This method randomly reorders the elements in the given list using default randomness

public class HashMapTestEight {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList
				<>(Arrays.asList(5, 6, 7, 8, 9));  
        
		Collections.shuffle(numbers);
        
        System.out.println(numbers);  
        
		
	}
}

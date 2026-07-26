package com.day20.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MazimumMinimumNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        
		Integer max =
			    list.stream()
			    .max(Comparator.naturalOrder())
			    .get();
	    
	    System.out.println("Maximum Number : "+max);
	    
	    Integer min = 
			    list.stream()
			    .min(Comparator.naturalOrder())
			    .get();
	    
	    System.out.println("Minimum Number : "+min);
	    
	}
}

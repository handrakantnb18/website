package com.day20.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargeNumber {

	public static void main(String[] args) {
		
		 List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
         
	     Integer second = 
	    		 list.stream()
	    		 .sorted(Comparator.reverseOrder())
	    		 .skip(1)
	    		 .findFirst()
	    		 .get();
	      
	     System.out.println(second);
	}
}

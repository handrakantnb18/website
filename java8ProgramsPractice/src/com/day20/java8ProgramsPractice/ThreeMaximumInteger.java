package com.day20.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMaximumInteger {

	public static void main(String[] args) {
		
		 List<Integer> list = Arrays.asList(
				 45, 12, 56, 15, 24, 75, 31, 89);
	        
		 System.out.println("--------------------");
		 System.out.println("Minimum 3 Number : ");
		 System.out.println("--------------------");
		 
		 list.stream()
		 .sorted()
		 .limit(3)
		 .forEach(System.out::println);
		 
		 System.out.println("-------------------");
		 System.out.println("Maximum 3 Number : ");
		 System.out.println("-------------------");
		 
		 list.stream()
		 .sorted(Comparator.reverseOrder())
		 .limit(3)
		 .forEach(System.out::println);
	        
	}
}

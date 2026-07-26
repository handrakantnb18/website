package com.day20.java8ProgramsPractice;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedElements {

	public static void main(String[] args) {
		
		 List<String> list = 
				 Arrays.asList("Pen", "Eraser", "Note Book", "Pen", 
						 "Pencil", "Pen", "Note Book", "Pencil");
         
	        Map<String, Long> elementCountMap = 
	        		list.stream()
	        		.collect(Collectors.groupingBy(
	        				Function.identity(),
	        				Collectors.counting()));
	         
	        java.util.Map.Entry<String, Long> mostFrequentElement = 
	        		elementCountMap
	        		.entrySet()
	        		.stream()
	        		.max(Map.Entry.comparingByValue())
	        		.get();
	         
	        System.out.println("Most Frequent Element : "
	        +mostFrequentElement.getKey());
	         
	        System.out.println("Count : "
	        +mostFrequentElement.getValue());
	   
	}
}

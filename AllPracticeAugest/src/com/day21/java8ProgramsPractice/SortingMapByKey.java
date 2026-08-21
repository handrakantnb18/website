package com.day21.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class SortingMapByKey {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(105, "Amit");  
	    map.put(106, "Vijay");  
	    map.put(107, "Rahul");  
		
	    map.entrySet()
	    .stream()
	    .sorted(Map.Entry.comparingByKey())
	    .forEach(System.out::println);
	    
	}
}

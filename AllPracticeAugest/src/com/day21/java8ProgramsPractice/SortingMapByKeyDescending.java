package com.day21.java8ProgramsPractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortingMapByKeyDescending {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(108, "Amit");  
	    map.put(109, "Vijay");  
	    map.put(110, "Rahul");  
	    map.put(111, "Pooja");
	    
	    map.entrySet()
	    .stream()
	    .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
	    .forEach(System.out::println);
	    
	}
}

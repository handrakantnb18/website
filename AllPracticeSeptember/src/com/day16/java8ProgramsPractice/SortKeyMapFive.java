package com.day16.java8ProgramsPractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

// we are sorting the Map entries by key in descending order.
// Creating a HashMap instance to store key-value pairs  

public class SortKeyMapFive {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit"); 
	    map.put(8,"Jaikumar");  
	    map.put(4,"Ram");
	    
	    map.entrySet()
	    .stream()
	    .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
	    .forEach(System.out::println);
	    
		
	}
}

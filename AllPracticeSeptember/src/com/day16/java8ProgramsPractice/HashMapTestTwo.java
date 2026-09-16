package com.day16.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// we are using a generic Map and traversing it using entrySet().

public class HashMapTestTwo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit"); 
	    map.put(8,"Jaikumar");  
	    map.put(4,"Ram");
	    
	    for(Map.Entry m : map.entrySet()) {
	    	System.out.println(m.getKey()+" "+m.getValue());
	    	
	    }	
		
	}
}

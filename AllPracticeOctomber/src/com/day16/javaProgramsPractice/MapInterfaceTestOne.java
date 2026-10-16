package com.day16.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// demonstrates storing key-value pairs.

public class MapInterfaceTestOne {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();  
		  
        map.put(1, "Rahul");  
        map.put(2, "Priya");  
        map.put(3, "Amit");  
        map.put(4, "Ram");  
        map.put(5, "Pooja");  
        map.put(6, "Praneet"); 
        map.put(7, "Sameer");  
        map.put(8, "Neha");  
        map.put(8, "Neeta");  
        
        System.out.println(map);  
        
	}
}

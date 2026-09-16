package com.day16.java8ProgramsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

// we are creating a LinkedHashMap to store student IDs and names, and iterating 

public class LinkedInMapSeven {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1001, "Rahul Sharma");
		map.put(1002, "Amit Patil");
		map.put(1003, "Sneha Deshmukh");
		map.put(1004, "Priya Kulkarni");
		map.put(1005, "Vijay Jadhav");
		map.put(1006, "Neha Joshi");
		map.put(1007, "Suresh Pawar");
		map.put(1008, "Pooja Shinde");
		map.put(1009, "Kiran Chavan");
		
		 System.out.println("Student Records:");  
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {  
	            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());  
	        }  
		
	}
}

package com.day23.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class UserNameId {

	public static void main(String[] args) {
		
		Map<Integer, User> map = new HashMap<>();
		
		map.put(101, new User(101, "Rahul", "Pune", 9876543210L, "rahul@gmail.com", 25, "Male"));
		map.put(102, new User(102, "Priya", "Mumbai", 9876543211L, "priya@gmail.com", 23, "Female"));
		map.put(103, new User(103, "Amit", "Nagpur", 9876543212L, "amit@gmail.com", 28, "Male"));
		map.put(104, new User(104, "Sneha", "Nashik", 9876543213L, "sneha@gmail.com", 24, "Female"));
		map.put(105, new User(105, "Rohit", "Kolhapur", 9876543214L, "rohit@gmail.com", 30, "Male"));
		map.put(106, new User(106, "Pooja", "Satara", 9876543215L, "pooja@gmail.com", 27, "Female"));
		map.put(107, new User(107, "Vikas", "Solapur", 9876543216L, "vikas@gmail.com", 29, "Male"));
		map.put(108, new User(108, "Neha", "Aurangabad", 9876543217L, "neha@gmail.com", 22, "Female"));
		map.put(109, new User(109, "Karan", "Sangli", 9876543218L, "karan@gmail.com", 31, "Male"));
		map.put(110, new User(110, "Anjali", "Thane", 9876543219L, "anjali@gmail.com", 26, "Female"));

		for(Map.Entry<Integer, User> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " -> "+entry.getValue());
			
		}
	}
}

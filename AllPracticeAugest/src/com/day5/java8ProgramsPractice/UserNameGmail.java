package com.day5.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class UserNameGmail {

	public static void main(String[] args) {
		
		 Map<Integer, User> userMap = new HashMap<>();

	        userMap.put(101, new User(101, "Amit", "amit@gmail.com", "9876543210", "Pune", 25, "Male"));
	        userMap.put(102, new User(102, "Rahul", "rahul@gmail.com", "9876543211", "Mumbai", 28, "Male"));
	        userMap.put(103, new User(103, "Sneha", "sneha@gmail.com", "9876543212", "Nashik", 24, "Female"));
	        userMap.put(104, new User(104, "Priya", "priya@gmail.com", "9876543213", "Kolhapur", 27, "Female"));
	        userMap.put(105, new User(105, "Rohit", "rohit@gmail.com", "9876543214", "Satara", 29, "Male"));
	        userMap.put(106, new User(106, "Neha", "neha@gmail.com", "9876543215", "Sangli", 23, "Female"));
	        userMap.put(107, new User(107, "Akash", "akash@gmail.com", "9876543216", "Solapur", 30, "Male"));
	        userMap.put(108, new User(108, "Pooja", "pooja@gmail.com", "9876543217", "Nagpur", 26, "Female"));
	        userMap.put(109, new User(109, "Kiran", "kiran@gmail.com", "9876543218", "Aurangabad", 31, "Male"));
	        userMap.put(110, new User(110, "Anjali", "anjali@gmail.com", "9876543219", "Ahmednagar", 22, "Female"));


	        for (Map.Entry<Integer, User> entry : userMap.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	        
	}
}

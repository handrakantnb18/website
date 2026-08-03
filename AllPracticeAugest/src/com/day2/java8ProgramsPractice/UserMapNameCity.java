package com.day2.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class UserMapNameCity {

	public static void main(String[] args) {
		
		Map<Integer, User> map = new HashMap<Integer, User>();
		
		map.put(101, new User(101, "Amit", "amit@gmail.com", 55000.0, "9876543210", "Pune"));
		map.put(102, new User(102, "Rahul", "rahul@gmail.com", 60000.0, "9876543211", "Mumbai"));
		map.put(103, new User(103, "Sneha", "sneha@gmail.com", 52000.0, "9876543212", "Nashik"));
		map.put(104, new User(104, "Priya", "priya@gmail.com", 68000.0, "9876543213", "Nagpur"));
		map.put(105, new User(105, "Rohit", "rohit@gmail.com", 49000.0, "9876543214", "Kolhapur"));
		map.put(106, new User(106, "Neha", "neha@gmail.com", 72000.0, "9876543215", "Aurangabad"));
		map.put(107, new User(107, "Vikas", "vikas@gmail.com", 58000.0, "9876543216", "Solapur"));
		map.put(108, new User(108, "Anjali", "anjali@gmail.com", 63000.0, "9876543217", "Satara"));
		map.put(109, new User(109, "Kiran", "kiran@gmail.com", 75000.0, "9876543218", "Sangli"));
		map.put(110, new User(110, "Pooja", "pooja@gmail.com", 67000.0, "9876543219", "Pune"));

		for(Map.Entry<Integer, User> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
			
		}
	}
}

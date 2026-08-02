package com.zeroToHero.corejava.oopsInterface;

import java.util.HashMap;
import java.util.Map;

public class UserEntrySetFilter {

	public static void main(String[] args) {
		
Map<Integer, User> map = new HashMap<Integer, User>();
		
		map.put(101, new User(101, "Amit", "9876543210", "amit@gmail.com", "Pune"));
		map.put(102, new User(102, "Rahul", "9876543211", "rahul@gmail.com", "Mumbai"));
		map.put(103, new User(103, "Priya", "9876543212", "priya@gmail.com", "Nagpur"));
		map.put(104, new User(104, "Sneha", "9876543213", "sneha@gmail.com", "Nashik"));
		map.put(105, new User(105, "Vikas", "9876543214", "vikas@gmail.com", "Kolhapur"));
		map.put(106, new User(106, "Pooja", "9876543215", "pooja@gmail.com", "Satara"));
		map.put(107, new User(107, "Rohit", "9876543216", "rohit@gmail.com", "Aurangabad"));
		map.put(108, new User(108, "Neha", "9876543217", "neha@gmail.com", "Solapur"));
		map.put(109, new User(109, "Kiran", "9876543218", "kiran@gmail.com", "Sangli"));
		map.put(110, new User(110, "Anjali", "9876543219", "anjali@gmail.com", "Pune"));
		
		map.entrySet().stream()
		.filter(entry -> entry.getValue().getCity()
				.equalsIgnoreCase("Pune"))
		.forEach(System.out::println);
		
	}
}

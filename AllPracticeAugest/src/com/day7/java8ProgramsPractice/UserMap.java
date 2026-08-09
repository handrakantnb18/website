package com.day7.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class UserMap {

	public static void main(String[] args) {
		
		Map<Integer, User> map = new HashMap<Integer, User>();
		
		map.put(101, new User(101, "Amit", "amit@gmail.com", "Pune", "9876543210", "IT", "Pune"));

		map.put(102, new User(102, "Rahul", "rahul@gmail.com", "Mumbai", "9876543211", "HR", "Mumbai"));

		map.put(103, new User(103, "Priya", "priya@gmail.com", "Nashik", "9876543212", "Finance", "Nashik"));

		map.put(104, new User(104, "Sneha", "sneha@gmail.com", "Pune", "9876543213", "IT", "Pune"));

		map.put(105, new User(105, "Akash", "akash@gmail.com", "Nagpur", "9876543214", "Sales", "Nagpur"));

		map.put(106, new User(106, "Neha", "neha@gmail.com", "Kolhapur", "9876543215", "HR", "Kolhapur"));

		map.put(107, new User(107, "Rohit", "rohit@gmail.com", "Sangli", "9876543216", "IT", "Sangli"));

		map.put(108, new User(108, "Pooja", "pooja@gmail.com", "Aurangabad", "9876543217", "Finance", "Aurangabad"));

		map.put(109, new User(109, "Vijay", "vijay@gmail.com", "Satara", "9876543218", "Sales", "Satara"));

		map.put(110, new User(110, "Kiran", "kiran@gmail.com", "Solapur", "9876543219", "IT", "Solapur"));
		
		
		//map.forEach((id, name) -> System.out.println(id+" "+name));
		
		map.values()
		.stream()
		.filter(user -> user.getDept().equals("IT"))
		.forEach(System.out::println);
		
	}
}

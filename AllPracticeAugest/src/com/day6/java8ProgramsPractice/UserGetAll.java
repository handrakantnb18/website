package com.day6.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class UserGetAll {

	public static void main(String[] args) {
		
		Map<Integer, User> user = new HashMap<Integer, User>();
		
		user.put(101, new User(101, "Amit", "amit@gmail.com","9876543210","Male", "Pune"));

		user.put(102, new User(102, "Rahul", "rahul@gmail.com", "9876543211", "Male", "Mumbai"));

		user.put(103, new User(103, "Priya", "priya@gmail.com","9876543212", "Female", "Pune"));

		user.put(104, new User(104, "Sneha", "sneha@gmail.com", "9876543213", "Female", "Nashik"));

		user.put(105, new User(105, "Vijay", "vijay@gmail.com","9876543214", "Male", "Sangli"));

		user.put(106, new User(106, "Neha", "neha@gmail.com", "9876543215", "Female", "Kolhapur"));

		user.put(107, new User(107, "Rohit", "rohit@gmail.com", "9876543216", "Male", "Pune"));

		user.put(108, new User(108, "Pooja", "pooja@gmail.com", "9876543217", "Female", "Satara"));
	        
		user.put(109, new User(109, "Suresh", "suresh@gmail.com", "9876543218", "Male", "Mumbai"));

		user.put(110, new User(110, "Kiran", "kiran@gmail.com", "9876543219", "Male", "Pune"));
		
		
//		user.forEach((id, users) -> {
//			System.out.println(id+""+users);
//		});
		
		
		user.values()
		.stream()
		.map(User::getName)
		.forEach(System.out::println);
		
		
		user.values()
		.stream()
		.filter(use -> use.getCity().equals("Pune"))
		.forEach(System.out::println);
		
	}
}

package com.day8.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

import com.day7.java8ProgramsPractice.User;

public class UserCity {

	public static void main(String[] args) {
		
		List<User> list = Arrays.asList(
			    new User(1, "Prakash", "Pune", "9876543210"),
			    new User(2, "Rahul", "Mumbai", "9876543211"),
			    new User(3, "Sneha", "Nashik", "9876543212"),
			    new User(4, "Amit", "Nagpur", "9876543213"),
			    new User(5, "Priya", "Pune", "9876543214")
			);
		
		
		list.stream()
		.filter(s -> s.getName().equals("Priya"))
		.forEach(System.out::println);
		
	}
}

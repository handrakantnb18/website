package com.day3.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserCity {

	public static void main(String[] args) {
		
		List<User> list = Arrays.asList(
				new User(1, "Ram", "9876543210","Pune"),
                new User(2, "Rahul","9876543210", "Mumbai"),
                new User(3, "Shiv", "9876543210", "Pune" ),
                new User(4, "Amit", "9876543210", "Delhi"),
                new User(5, "Priya", "9876543210", "Bangalore"),
                new User(6, "Sneha", "9876543210", "Hyderabad"),
                new User(7, "Vikas", "9876543210", "Chennai"),
                new User(8, "Neha", "9876543210", "Nagpur"),
                new User(9, "Rohit", "9876543210", "Pune"),
                new User(10, "Anjali", "9876543210", "Mumbai")
				
				);
		
		List<User> city = 
				list.stream()
				.filter(c -> c.getCity().equals("Pune"))
				.collect(Collectors.toList());
		
		System.out.println(city);
		
	}
}

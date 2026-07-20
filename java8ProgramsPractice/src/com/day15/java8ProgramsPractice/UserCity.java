package com.day15.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class UserCity {

	public static void main(String[] args) {
		
		List<User> list = Arrays.asList(
				 new User(101, "Ram", "Pune", "ram@gmail.com", 9876543210L),
				    new User(102, "Shyam", "Mumbai", "shyam@gmail.com", 9876543211L),
				    new User(103, "Rahul", "Nagpur", "rahul@gmail.com", 9876543212L),
				    new User(104, "Amit", "Nashik", "amit@gmail.com", 9876543213L),
				    new User(105, "Priya", "Kolhapur", "priya@gmail.com", 9876543214L),
				    new User(106, "Neha", "Pune", "neha@gmail.com", 9876543215L),
				    new User(107, "Kiran", "Satara", "kiran@gmail.com", 9876543216L),
				    new User(108, "Rohit", "Sangli", "rohit@gmail.com", 9876543217L),
				    new User(109, "Pooja", "Solapur", "pooja@gmail.com", 9876543218L),
				    new User(110, "Vikas", "Aurangabad", "vikas@gmail.com", 9876543219L)
				); 
		
		list.stream()
		.filter(s -> s.getCity().equals("Pune"))
		.forEach(System.out::println);
	}
}

package com.day14.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class UserNames {

	public static void main(String[] args) {
		
		List<User> user = Arrays.asList(
				 new User(101, "Rahul", "Pune", "rahul@gmail.com", "9876543210"),
	                new User(102, "Amit", "Mumbai", "amit@gmail.com", "9876543211"),
	                new User(103, "Sachin", "Nagpur", "sachin@gmail.com", "9876543212"),
	                new User(104, "Priya", "Nashik", "priya@gmail.com", "9876543213"),
	                new User(105, "Sneha", "Kolhapur", "sneha@gmail.com", "9876543214"),
	                new User(106, "Rohit", "Satara", "rohit@gmail.com", "9876543215"),
	                new User(107, "Pooja", "Solapur", "pooja@gmail.com", "9876543216"),
	                new User(108, "Kiran", "Aurangabad", "kiran@gmail.com", "9876543217"),
	                new User(109, "Neha", "Sangli", "neha@gmail.com", "9876543218"),
	                new User(110, "Vikas", "Thane", "vikas@gmail.com", "9876543219")
				
				);
		
		
		user.forEach(System.out::println);
		
	}
	
}

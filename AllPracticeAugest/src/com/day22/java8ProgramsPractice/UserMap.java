package com.day22.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class UserMap {

	public static void main(String[] args) {
		
		List<User> users = Arrays.asList(
		 new User(1, "Rahul", "rahul@gmail.com", "FC Road", "9876543210", "Pune", "Male"),

		    new User(2, "Priya", "priya@gmail.com", "Andheri", "9876543211", "Mumbai", "Female"),

		    new User(3, "Amit", "amit@gmail.com", "College Road", "9876543212", "Nashik", "Male"),

		    new User(4, "Sneha", "sneha@gmail.com", "Kothrud", "9876543213", "Pune", "Female"),

		    new User(5, "Vijay", "vijay@gmail.com", "Market Road", "9876543214", "Sangli", "Male"),

		    new User(6, "Neha", "neha@gmail.com", "Rajarampuri", "9876543215", "Kolhapur", "Female"),

		    new User(7, "Akash", "akash@gmail.com", "Viman Nagar", "9876543216", "Pune", "Male"),

		    new User(8, "Pooja", "pooja@gmail.com", "Baner", "9876543217", "Pune", "Female"),

		    new User(9, "Sagar", "sagar@gmail.com", "MIDC", "9876543218", "Aurangabad", "Male"),

		    new User(10, "Kiran", "kiran@gmail.com", "Station Road", "9876543219", "Solapur", "Female")
		);
		
		users.stream()
		.filter(u -> u.getCountry().equalsIgnoreCase("Solapur"))
		.forEach(System.out::println);
		
		
	}
}

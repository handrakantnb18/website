package com.day14.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdminIdDept {

	public static void main(String[] args) {
		
		List<Admin> list = Arrays.asList(
				new Admin(111, "Ram", "ram@gmail.com", "IT"),
				new Admin(111, "Ram", "ram@gmail.com", "IT"),
		        new Admin(112, "Shyam", "shyam@gmail.com", "HR"),
		        new Admin(113, "Rahul", "rahul@gmail.com", "Finance"),
		        new Admin(114, "Amit", "amit@gmail.com", "Admin"),
		        new Admin(115, "Sachin", "sachin@gmail.com", "Development"),
		        new Admin(116, "Priya", "priya@gmail.com", "Testing"),
		        new Admin(117, "Sneha", "sneha@gmail.com", "Support"),
		        new Admin(118, "Kiran", "kiran@gmail.com", "Security"),
		        new Admin(119, "Neha", "neha@gmail.com", "Marketing"),
		        new Admin(120, "Vikas", "vikas@gmail.com", "HR")
				
				);
		
		Map<Integer, String> map=
				list.stream()
				.collect(Collectors.toMap(
						Admin::getId, Admin::getDept, (oldValue, newValue) 
						-> oldValue));
		
		map.forEach((key, value) -> System.out.println(key + " : "+value));
		

	}
}

package com.day17.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentNameMarks {

	public static void main(String[] args) {
		
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		
		map.put(1, new Student(1, "Rahul", "ABC College", "rahul@gmail.com", "9876543210", 7.50, "Pune"));
		
		 map.put(2, new Student(2, "Amit", "XYZ College", "amit@gmail.com", "9876543211", 82.0, "Mumbai"));

	        map.put(3, new Student(3, "Priya", "ABC College", "priya@gmail.com", "9876543212", 91.5, "Pune"));

	        map.put(4, new Student(4, "Sneha", "PQR College", "sneha@gmail.com", "9876543213", 85.0, "Nashik"));

	        map.put(5, new Student(5, "Rohit", "XYZ College", "rohit@gmail.com", "9876543214", 74.5, "Satara"));

	        map.put(6, new Student(6, "Neha", "ABC College", "neha@gmail.com", "9876543215", 88.0, "Kolhapur"));

	        map.put(7, new Student(7, "Akash", "PQR College", "akash@gmail.com", "9876543216", 69.5, "Sangli"));

	        map.put(8, new Student(8, "Pooja", "XYZ College", "pooja@gmail.com", "9876543217", 95.0, "Pune"));

	        map.put(9, new Student(9, "Vikas", "ABC College", "vikas@gmail.com", "9876543218", 81.5, "Mumbai"));

	        map.put(10, new Student(10, "Kiran", "PQR College", "kiran@gmail.com", "9876543219", 76.0, "Solapur"));
		
//	        map.forEach((id, std) -> {
//	        	System.out.println(id+" : "+std);
//	        });
	      
//	        map.values()
//	        .stream()
//	        .filter(s -> s.getMarks() > 85 )
//	        .forEach(System.out::println);
	        
	        Map<String, Long> coll =
	        		map.values()
	        		.stream()
	        		.collect(Collectors.groupingBy(
	        				Student::getCollage,
	        				Collectors.counting()
	        				));
	        
	        System.out.println(coll);
	}
}

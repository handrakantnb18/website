package com.day8.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {

	public static void main(String[] args) {
		
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		
		map.put(101, new Student(101, "Amit", "Java", "amit@gmail.com", "9876543210", "IT", "Pune"));

		map.put(102, new Student(102, "Rahul", "Spring Boot", "rahul@gmail.com", "9876543211", "IT", "Mumbai"));

		map.put(103, new Student(103, "Priya", "Python", "priya@gmail.com", "9876543212", "CS", "Nashik"));

		map.put(104, new Student(104, "Sneha", "React", "sneha@gmail.com", "9876543213", "IT", "Pune"));

		map.put(105, new Student(105, "Akash", "Angular", "akash@gmail.com", "9876543214", "CS", "Nagpur"));

		map.put(106, new Student(106, "Neha", "Java", "neha@gmail.com", "9876543215", "IT", "Kolhapur"));

		map.put(107, new Student(107, "Rohit", "Spring Boot", "rohit@gmail.com", "9876543216", "IT", "Sangli"));

		map.put(108, new Student(108, "Pooja", "Python", "pooja@gmail.com", "9876543217", "CS", "Aurangabad"));

		map.put(109, new Student(109, "Vijay", "Java","vijay@gmail.com", "9876543218", "IT", "Satara"));

		map.put(110, new Student(110, "Kiran", "React", "kiran@gmail.com", "9876543219", "CS", "Solapur"));
		
		//map.forEach((id, name) -> System.out.println(id+" "+name));
		
//		map.values()
//		.stream()
//		.map(Student::getName)
//		.forEach(System.out::println);
		
		map.values()
		.stream()
		.filter(s -> s.getCourse().equals("Java"))
		.forEach(System.out::println);
		
		
		
	}
}

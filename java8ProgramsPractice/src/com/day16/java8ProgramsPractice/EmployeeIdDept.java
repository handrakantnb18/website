package com.day16.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeIdDept {

	public static void main(String[] args) {
		
		List<Employee> emp = Arrays.asList(
				//new Employee(11, "Ram", "ram@gmail.com", "IT", 987564231),
				new Employee(11, "Ram", "ram@gmail.com", "IT", 987564231),
			    new Employee(12, "Shyam", "shyam@gmail.com", "HR", 987564232),
			    new Employee(13, "Rahul", "rahul@gmail.com", "Finance", 987564233),
			    new Employee(14, "Amit", "amit@gmail.com", "Admin", 987564234),
			    new Employee(15, "Priya", "priya@gmail.com", "Sales", 987564235),
			    new Employee(16, "Sneha", "sneha@gmail.com", "Marketing", 987564236),
			    new Employee(17, "Karan", "karan@gmail.com", "Development", 987564237),
			    new Employee(18, "Neha", "neha@gmail.com", "Testing", 987564238),
			    new Employee(19, "Vikas", "vikas@gmail.com", "Support", 987564239),
			    new Employee(20, "Anjali", "anjali@gmail.com", "Operations", 987564240)
				);
		
		Map<Integer, String> map = 
				emp.stream()
				.collect(Collectors.toMap(
						Employee::getId,
						Employee::getDept));
		
		System.out.println(map);
		
	}
}

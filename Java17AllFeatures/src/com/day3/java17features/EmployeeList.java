package com.day3.java17features;

import java.util.Arrays;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				new Employee(01, "Ajay", "ajay@gmail.com", "IT", 55000.00)
				
				);
		
		list.stream()
		.forEach(System.out::println);
		
		
	}
}

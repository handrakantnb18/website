package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSalary {

	public static void main(String[] args) {

	Map<Integer, Employee> emp = new HashMap<Integer, Employee>();

	 emp.put(101, new Employee(101, "Rahul", "rahul@gmial.com", 78000.00, "IT")),
	 emp.put(102, new Employee(102, "Amit", "amit@gmial.com", 80000.00, "IT")),
	 emp.put(103, new Employee(103, "Vijat", "vijay@gmial.com", 98000.00, "IT")),
	 emp.put(104, new Employee(104, "pooja", "pooja@gmial.com", 55000.00, "IT"));

//		List<Employee> employee = Arrays.asList(
//				new Employee(101, "Ram", "ram@gmail.com", 75000.00, "IT"),
//				new Employee(102, "Ajit", "ajit@gmail.com", 55000.00, "Sales"),
//				new Employee(103, "Ajay", "ajay@gmail.com", 75000.00, "IT"),
//				new Employee(104, "Amit", "amit@gmail.com", 90000.00, "Sales")
//
		
		//);

//		emp.forEach((id) -> {
//			System.out.println(id);
//		});
		
		emp.values()
		.stream()
		.count(Comparator.comparing(Employee::getSalary > 75000.00))
		.max()
		.forEach(System.out::println);
		
		System.out.println(emp1);
	}
}

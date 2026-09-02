package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeSalary {

	public static void main(String[] args) {

		// Map<Integer, Employee> emp = new HashMap<Integer, Employee>();

		List<Employee> emp = Arrays.asList(
				new Employee(101, "Ram", "ram@gmail.com", 75000.00, "IT"),
				new Employee(102, "Ajit", "ajit@gmail.com", 98000.00, "Sales")

		// emp.put(101, Employee(101, "Rahul", "rahul@gmial.com", 78000.00, "IT"))

		);

//		emp.forEach((id) -> {
//			System.out.println(id);
//		});
		
		
	}
}

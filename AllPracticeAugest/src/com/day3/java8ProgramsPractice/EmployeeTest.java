package com.day3.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				new Employee(101, "Rahul", 70000.0),
                new Employee(102, "Amit", 40000.0),
                new Employee(103, "Priya", 65000.0),
                new Employee(104, "Neha", 55000.0),
                new Employee(105, "Vikas", 30000.0)
				);
		
		List<Employee> e1 = 
				list.stream()
				.filter(emp -> emp.getSalary() > 50000)
				.sorted(Comparator.comparing(Employee::getName))
				.toList();
		
		e1.forEach(System.out::println);
	}
}

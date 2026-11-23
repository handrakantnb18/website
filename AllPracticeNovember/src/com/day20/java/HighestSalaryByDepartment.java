package com.day20.java;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalaryByDepartment {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
                new Employee(1, "Rahul", "IT", 70000),
                new Employee(2, "Amit", "IT", 90000),
                new Employee(3, "Priya", "HR", 60000),
                new Employee(4, "Sneha", "HR", 80000),
                new Employee(5, "Vikas", "Finance", 75000)
        );
		
		// Find the highest-paid employee in each department
		
//		 Map<String, Employee> result = employees.stream()
//	                .collect(Collectors.groupingBy(
//	                        Employee::getDepartment,
//	                        Collectors.collectingAndThen(
//	                                Collectors.maxBy(
//	                                        Comparator.comparingDouble(Employee::getSalary)
//	                                ),
//	                                Optional::get
//	                        )
//	                ));
//
//	        result.forEach((department, employee) ->
//	                System.out.println(department + " : " + employee));
	        
	     // Partition employees into salary groups

	      Map<Boolean, List<Employee>> result1 = employees.stream()
	              .collect(Collectors.partitioningBy(
	                      e -> e.getSalary() >= 50000
	              ));
	      
	      System.out.println("High Salary: " + result1.get(true));
	      System.out.println("Low Salary: " + result1.get(false));

	        
	        
	}
}

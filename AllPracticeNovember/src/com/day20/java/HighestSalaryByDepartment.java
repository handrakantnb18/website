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

//	      Map<Boolean, List<Employee>> result1 = employees.stream()
//	              .collect(Collectors.partitioningBy(
//	                      e -> e.getSalary() >= 50000
//	              ));
//	      
//	      System.out.println("High Salary: " + result1.get(true));
//	      System.out.println("Low Salary: " + result1.get(false));

	        


	   //  Sort employees by salary descending
	   
//	   List<Employee> result2 = employees.stream()
//	           .sorted(Comparator.comparingDouble(Employee::getSalary)
//	                   .reversed())
//	           .collect(Collectors.toList());
//	   
//	   result2.forEach(System.out::println);


		// Sort employees by salary Ascending
		
//		List<Employee> result2 = employees.stream()
//		        .sorted(Comparator.comparingDouble(Employee::getSalary)
//		                )
//		        .collect(Collectors.toList());
//		
//		result2.forEach(System.out::println);
  

		// Convert a List into a Map using Java 17

//		Map<Integer, String> result3 = employees.stream()
//		        .collect(Collectors.toMap(
//		                Employee::getId,
//		                Employee::getName
//		        ));
//		
//		System.out.println(result3);
//		

		// If duplicate employee IDs exist, handle them using a merge function

//		Map<Integer, String> result4 = employees.stream()
//		        .collect(Collectors.toMap(
//		                Employee::getId,
//		                Employee::getName,
//		                (existing, replacement) -> existing
//		        ));
//		
//		System.out.println(result4);
//		

		// Find the average salary department-wise

		Map<String, Double> result5 = employees.stream()
		        .collect(Collectors.groupingBy(
		                Employee::getDepartment,
		                Collectors.averagingDouble(Employee::getSalary)
		        ));

		result5.forEach((department, averageSalary) ->
		        System.out.println(department + " : " + averageSalary));

		
	}
}

package com.day4.java8ProgramsPractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHeighestSalary {

	public static void main(String[] args) {

		Map<String, Employee> emp = new HashMap<>();

		emp.put("Rahul", new Employee(1, "Rahul Sharma", "IT", 65000.0, "Pune"));
		
		emp.put("Priya", new Employee(2, "Priya Patel", "HR", 55000.0, "Mumbai"));
		
		emp.put("Amit", new Employee(3, "Amit Kumar", "Finance", 72000.0, "Delhi"));
		
		emp.put("Sneha", new Employee(4, "Sneha Joshi", "IT", 68000.0, "Pune"));
		
		emp.put("Vikram", new Employee(5, "Vikram Singh", "Sales", 60000.0, "Bangalore"));
		
		emp.put("Neha", new Employee(6, "Neha Gupta", "HR", 58000.0, "Hyderabad"));
		
		emp.put("Rohan", new Employee(7, "Rohan Mehta", "Finance", 75000.0, "Mumbai"));
		
		emp.put("Anjali", new Employee(8, "Anjali Deshmukh", "IT", 70000.0, "Nagpur"));
		
		emp.put("Karan", new Employee(9, "Karan Shah", "Sales", 62000.0, "Ahmedabad"));
		
		emp.put("Pooja", new Employee(10, "Pooja Verma", "Marketing", 64000.0, "Chennai"));

//		emp.forEach((id, name) -> {
//			System.out.println(id+" : "+name);
//		});
		
//		 Optional<Employee> result = emp.values()
//	                .stream()
//	                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//	                .skip(1)
//	                .findFirst();
//
//	        result.ifPresent(e -> 
//	            System.out.println("Second Highest Salary: " 
//	                    + e.getName() + " - " + e.getSalary())
//	        );
		
	        
//		 Optional<Employee> result =
//			    emp.stream()
//			        .collect(Collectors.groupingBy(
//			            Employee::getDept,
//			            Collectors.collectingAndThen(
//			                Collectors.toList(),
//			                list -> list.stream()
//			                    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//			                    .skip(1)
//			                    .findFirst()
//			            )
//			        ));

		
	        Map<String, Optional<Double>> result1 =
	        	    emp.values().stream()
	        	        .collect(Collectors.groupingBy(
	        	            Employee::getDept,
	        	            Collectors.collectingAndThen(
	        	                Collectors.mapping(Employee::getSalary, Collectors.toList()),
	        	                salaries -> salaries.stream()
	        	                    .distinct()
	        	                    .sorted(Comparator.reverseOrder())
	        	                    .skip(1)
	        	                    .findFirst()
	        	            )
	        	        ));

	        System.out.println(result1);
	        
	}
}

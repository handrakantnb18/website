package com.day27.java8ProgramsPractice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeStreamSalary {

	public static void main(String[] args) {
		
		List<EmployeeStream> emp = List.of(
				new EmployeeStream(1, "Rahul", "IT", 90000.0),
				new EmployeeStream(2, "Amit", "IT", 80000.0),
				new EmployeeStream(3, "Vijay", "IT", 70000.0),
				
				new EmployeeStream(4, "Priya", "HR", 60000.0),
				new EmployeeStream(5, "Sneha", "HR", 55000.0),
		        new EmployeeStream(6, "Neha", "HR", 50000.0),

		        new EmployeeStream(7, "Rohit", "Finance", 85000.0),
		        new EmployeeStream(8, "Suresh", "Finance", 75000.0),
		        new EmployeeStream(9, "Kiran", "Finance", 65000.0)
				);
		
		
		Map<String, Optional<EmployeeStream>> result = emp.stream()
				.collect(Collectors.groupingBy(
						EmployeeStream::getDept,
						Collectors.collectingAndThen(
								Collectors.toMap(
										EmployeeStream:: getSalary,
										Function.identity(),
										BinaryOperator.maxBy(
												Comparator.comparing(
														EmployeeStream::getSalary))),
								map -> map.values().stream()
								.sorted(Comparator.comparing(
										EmployeeStream::getSalary)
										.reversed())
								.skip(1)
								.findFirst()
								)
						));
		System.out.println(result);
		
		
	}
}

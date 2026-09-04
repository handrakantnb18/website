package com.day3.java17features;

import java.nio.file.DirectoryStream.Filter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(101, new Employee(101, "Ram", "ram@gmail.com", "IT", 75000.00));
		
		map.put(102, new Employee(102, "Ajit", "ajit@gmail.com", "HR", 55000.00));
		
		map.put(103, new Employee(103, "Pooja", "pooja@gmail.com", "IT", 79000.00));
		
		
//		map.forEach((id , name) -> {
//			System.out.println(id+" : "+name);
//		});
		
//		map.values()
//		.stream()
//		.collect(Collectors.counting(Employee::getSalary > 60000))
//		.forEach(System.out::println);
		
		// find greater than salary form the employee
		List<Employee> max =
		map.values()
		.stream()
		.filter(emp -> emp.getSalary() > 60000.00)
		.toList();
		
		System.out.println(max);
		
		
//		Integer max1 =
//				map.values()
//				
//				.stream()
//				.distinct()
//				.sorted(emp -> emp.setSalary().equals("IT"))
//				.skip(2)
//				.findFirst()
//				.get();
//				
//		System.out.println(max1);
			
		map.forEach((id, name) -> {
			if(name.getSalary() > 66000.00) {
				System.out.println(name);
			}
		});
	
		
	}
}

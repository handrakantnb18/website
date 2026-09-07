package com.day7.java8ProgramsPractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		emp.put(1, new Employee(1, "Ram", "ram@gmail.com", 55000.00, "IT", "Pune"));
		
		emp.put(2, new Employee(2, "Amit", "amit@gmail.com", 78000.00, "Sales", "Mumbai"));
		
		emp.put(3, new Employee(3, "Rahul", "rahul@gmail.com", 880000.00, "HR", "Pune"));
		
		emp.put(4, new Employee(4, "Pooja", "pooja@gmail.com", 90000.00, "IT", "Pune"));
		
		emp.put(5, new Employee(5, "Priya", "priya@gmail.com", 45000.00, "HR", "Hyd"));
		
		// find all te employees
//		emp.forEach((id, name) -> {
//			System.out.println(id+"  "+name);
//		});
		
		List<Employee> sal =
		emp.values()
		.stream()
		.filter(e -> e.getSalary() < 60000)
		.toList();
		
		System.out.println(sal);
		
	}
}

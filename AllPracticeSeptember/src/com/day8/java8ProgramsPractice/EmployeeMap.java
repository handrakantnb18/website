package com.day8.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

import com.day7.java8ProgramsPractice.Employee;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(1, new Employee(1, "Ram", "ram@gmail.com", 55000.00, "IT", "Pune"));
		
		map.put(2, new Employee(2, "Amit", "amit@gmail.com", 78000.00, "Sales", "Mumbai"));
		
		map.put(3, new Employee(3, "Rahul", "rahul@gmail.com", 880000.00, "HR", "Pune"));
		
		map.put(4, new Employee(4, "Pooja", "pooja@gmail.com", 90000.00, "IT", "Pune"));
		
		map.put(5, new Employee(5, "Priya", "priya@gmail.com", 45000.00, "HR", "Hyd"));
		
		
		map.forEach((id, name) -> {
			System.out.println(id+ " "+name);
		});
		
		
		
	}
}

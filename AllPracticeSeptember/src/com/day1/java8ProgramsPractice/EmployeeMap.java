package com.day1.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(1, new Employee(101, "Chandrakant", "chandrakant@gmail.com", "IT", 55000.00, "Pune"));
		
		map.put(2, new Employee(102, "Rahul", "rahul@gmail.com", "Sales", 85000.00, "Mumbai"));
		
		map.put(3, new Employee(103, "Ram", "ram@gmail.com", "Marketing", 95000.00, "Pune"));
		
		map.put(4, new Employee(104, "Ajay", "ajay@gmail.com", "Admin", 78000.00, "Mumbai"));
		
		map.put(5, new Employee(105, "Amit", "amit@gmail.com", "IT", 56000.00, "Hydrabad"));
		
		
		
		// fetch all employees
//		map.forEach((id, name) -> {
//			System.out.println(id+" "+name);
//		});
		
		map.forEach((id, sal) -> {
			if(sal.getSalary() > 60000)
				System.out.println(sal);
		});
		
	}
}

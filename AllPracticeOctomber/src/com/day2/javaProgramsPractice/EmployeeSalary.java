package com.day2.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;


public class EmployeeSalary {

	public static void main(String[] args) {
		
		Map<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		emp.put(1, new Employee(101, "chandrakant", "chandrakant@gmail.com", 80000.00, "IT", "Pune", "software engineer"));

		emp.put(2, new Employee(102, "priya", "priya@gmail.com", 55000.00, "Trans", "Mumbai", "managaer"));

		emp.put(3, new Employee(103, "Pooja", "pooja@gmail.com", 85000.00, "HR", "Pune", "Admin"));

		emp.put(4, new Employee(104, "Amit", "amit@gmail.com", 60000.00, "HR", "Mumbai", "managaer"));

		emp.put(5, new Employee(105, "Vijay", "vijay@gmail.com", 95000.00, "IT", "Pune", "Sales"));

		emp.put(6, new Employee(106, "Ram", "ram@gmail.com", 87000.00, "Trans", "Mumbai", "managaer"));

		
//		emp.forEach((id, name) -> {
//			System.out.println(id+" "+name);
//		});
		
		
		emp.forEach((id, salary) -> {
			
			if(salary.getSalary() < 70000) {
				System.out.println(salary);
			}
		});
		
		
	}
}

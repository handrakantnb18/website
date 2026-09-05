package com.day5.java17features;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		Map<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		emp.put(1, new Employee(1, "Chandrakant", "chandrakant@gmail.com", 55000.00, "IT", "Pune"));
		
		emp.put(2, new Employee(2, "Ram", "ram@gmail.com", 50000.00, "Sales", "Mumbai"));
		
		emp.put(3, new Employee(3, "Ajit", "ajit@gmail.com", 78000.00, "IT", "Pune"));
		
		emp.put(4, new Employee(4, "Amit", "amit@gmail.com", 70000.00, "Trans", "Hyd"));
		
		emp.put(5, new Employee(5, "pooja", "pooja@gmail.com", 46000.00, "HR", "Mumbai"));
		
//		emp.forEach((id, name) -> {
//			System.out.println(id+" : "+name);
//		});
		
		List<Employee> empolyee = 
		emp.values()
		.stream()
		.filter(e -> e.getSalary() > 56000.00)
		.toList();
		
		System.out.println(empolyee);
		
		System.out.println();
		emp.forEach((id, name) ->  {
			if(name.getSalary() > 60000.00)
			{
				System.out.println(name);
			}
		});
		
	}
}

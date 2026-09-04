package com.day4.java17features;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		Map<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		emp.put(1, new Employee(1, "Ram", "ram@gmail.com", 25000.00, "IT", "Pune"));
		
		emp.put(2, new Employee(2, "Abhi", "abhi@gmail.com", 44000.00, "Sales", "Mumbai"));
		
		emp.put(3, new Employee(3, "Ajit", "ajit@gmail.com", 56000.00, "IT", "Pune"));
		
		emp.put(4, new Employee(4, "Pooja", "pooja@gmail.com", 32000.00, "HR", "Hydrabad"));
		
		emp.put(5, new Employee(5, "Raju", "raju@gmail.com", 35000.00, "HR", "bangalore"));

		
//		emp.forEach((id, name) -> {
//			System.out.println(id+ " "+name);
//		});
		
//		List<Employee> sal =
//				emp.values()
//				.stream()
//				.filter(employee -> employee.getSalary() > 35000.00)
//				.toList();
//		
//		System.out.println(sal);
		
		emp.forEach((id, name) -> {
			if(name.getSalary() > 35000.00)
			{
				System.out.println(name);  
			}
		});
		
		
	}
}

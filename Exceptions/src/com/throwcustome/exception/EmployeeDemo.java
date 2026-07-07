package com.throwcustome.exception;

import com.allcustome.exceptions.*;
import java.util.Scanner;

public class EmployeeDemo {

	void employeeDemo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee : ");
		
		String emp = sc.next("Amit");
		
		if(emp == Amit)
		{
			throw new EmployeeNotFoundException("Employee not found");
		}
		else
		{
			System.out.println("Employee Found");
		}
	}
	public static void main(String[] args) {
		
		EmployeeDemo ed = new EmployeeDemo();
		
		try
		{
			ed.employeeDemo();
		}
		catch(EmployeeNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}

package com.throwcustome.exception;

import com.allcustome.exceptions.*;
import java.util.Scanner;

public class EmployeeDemo {

    void employeeDemo() throws EmployeeNotFoundException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");

        String emp = sc.next();

        if ("chandr".equals(emp)) {
            System.out.println("Employee Found");
        } else {
            throw new EmployeeNotFoundException("Employee not found");
        }

        sc.close();
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

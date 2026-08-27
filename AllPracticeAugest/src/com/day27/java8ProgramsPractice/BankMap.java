package com.day27.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class BankMap {

	public static void main(String[] args) {
		
		Map<Integer, Bank> map = new HashMap<Integer, Bank>();
		
		map.put(101, new Bank(101, "SBI", "sbi@gmail.com", "9876543210", "Pune", "Shivaji Nagar", "Savings", 50000.0));

		map.put(102, new Bank(102, "HDFC", "hdfc@gmail.com", "9876543211", "Mumbai", "Andheri", "Current", 75000.0));

		map.put(103, new Bank(103, "ICICI", "icici@gmail.com",     "9876543212", "Pune", "Kothrud", "Savings", 65000.0));

		map.put(104, new Bank(104, "Axis Bank", "axis@gmail.com", "9876543213", "Nashik", "College Road", "Current", 90000.0));

		map.put(105, new Bank(105, "Kotak", "kotak@gmail.com", "9876543214", "Pune", "Hinjewadi", "Savings", 45000.0));

		map.put(106, new Bank(106, "Bank of Baroda", "bob@gmail.com", "9876543215", "Sangli", "Main Branch", "Savings", 55000.0));

		map.put(107, new Bank(107, "Canara Bank", "canara@gmail.com", "9876543216", "Kolhapur", "Rajarampuri", "Current", 80000.0));

		map.put(108, new Bank(108, "Punjab National Bank", "pnb@gmail.com", "9876543217", "Pune", "Aundh", "Savings", 70000.0));

		map.put(109, new Bank(109, "Union Bank", "union@gmail.com", "9876543218", "Mumbai", "Dadar", "Current", 95000.0));

		map.put(110, new Bank(110, "IndusInd Bank", "indusind@gmail.com", "9876543219", "Pune", "Viman Nagar", "Savings", 60000.0));
	        
	   for(Map.Entry<Integer, Bank> entry : map.entrySet()) {
		   System.out.println("| Key   : | "+entry.getKey()+" |");
		   System.out.println("| Value : | "+entry.getValue()+" |");
		   System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		   
		   
		   
	   }
		
	}
}

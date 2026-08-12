package com.day12.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class BankMap {

	public static void main(String[] args) {
		
		Map<Integer, Bank> map = new HashMap<Integer, Bank>();
		
		map.put(101, new Bank(101, "HDFC Bank", "Pune", "9876543210", 1234567890.0, "hdfc@gmail.com", "Savings"));

        map.put(102, new Bank(102, "ICICI Bank", "Mumbai", "9876543211", 2234567890.0, "icici@gmail.com", "Current"));

        map.put(103, new Bank(103, "State Bank of India", "Sangli", "9876543212", 3234567890.0, "sbi@gmail.com", "Savings"));

        map.put(104, new Bank(104, "Axis Bank", "Pune", "9876543213", 4234567890.0, "axis@gmail.com", "Current"));

        map.put(105, new Bank(105, "Kotak Mahindra Bank", "Nashik", "9876543214", 5234567890.0, "kotak@gmail.com", "Savings"));

        map.put(106, new Bank(106, "Bank of Baroda", "Kolhapur", "9876543215", 6234567890.0, "bob@gmail.com", "Current"));

        map.put(107, new Bank(107, "Punjab National Bank", "Satara", "9876543216", 7234567890.0, "pnb@gmail.com", "Savings"));

        map.put(108, new Bank(108, "IndusInd Bank", "Nagpur", "9876543217", 8234567890.0, "indusind@gmail.com", "Current"));

        map.put(109, new Bank(109, "Yes Bank", "Aurangabad", "9876543218", 9234567890.0, "yesbank@gmail.com", "Savings"));

        map.put(110, new Bank(110, "Canara Bank", "Solapur", "9876543219", 1034567890.0, "canara@gmail.com", "Current"));
        
        map.forEach((key, value) -> System.out.println(key+" "+value));
        
        
        
	}
}

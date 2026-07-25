package com.day18.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BankIdMobile {

	public static void main(String[] args) {
		
		List<Bank> list = Arrays.asList(
			    new Bank(11, "IT", "Chandrakant", "9871234565"),
			    new Bank(12, "HR", "Rahul", "9871234566"),
			    new Bank(13, "Finance", "Amit", "9871234567"),
			    new Bank(14, "Sales", "Sneha", "9871234568"),
			    new Bank(15, "Admin", "Priya", "9871234569"),
			    new Bank(16, "Operations", "Vijay", "9871234570"),
			    new Bank(17, "Support", "Anjali", "9871234571"),
			    new Bank(18, "Marketing", "Rohan", "9871234572"),
			    new Bank(19, "Accounts", "Neha", "9871234573"),
			    new Bank(20, "Development", "Suresh", "9871234574")
			);
		
		Map<Integer, String> map = list.stream()
				.collect(Collectors.toMap(
						Bank::getId,
						Bank::getMobileNo));
		
		map.forEach((id, mobileNo) -> 
		System.out.println(id+ " : "+mobileNo));
		
	}
}

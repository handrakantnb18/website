package com.day16.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BankIdAccount {

	public static void main(String[] args) {
		
		List<Bank> bankAcc = Arrays.asList(
				 new Bank(11110, "Rahul", 789798988, "rahul@gmail.com", 9876541230L),
				    new Bank(11111, "Amit", 456789123, "amit@gmail.com", 9876541231L),
				    new Bank(11112, "Priya", 123456789, "priya@gmail.com", 9876541232L),
				    new Bank(11113, "Sneha", 987654321, "sneha@gmail.com", 9876541233L),
				    new Bank(11114, "Rohit", 654321987, "rohit@gmail.com", 9876541234L),
				    new Bank(11115, "Pooja", 789456123, "pooja@gmail.com", 9876541235L),
				    new Bank(11116, "Karan", 321654987, "karan@gmail.com", 9876541236L),
				    new Bank(11117, "Neha", 147258369, "neha@gmail.com", 9876541237L),
				    new Bank(11118, "Vikas", 963852741, "vikas@gmail.com", 9876541238L),
				    new Bank(11119, "Anjali", 852741963, "anjali@gmail.com", 9876541239L)
				
				);
		
		Map<Integer, Integer> map = 
				bankAcc.stream()
				.collect(Collectors.toMap(
						Bank::getId,
						Bank::getAccountNo));
		
		System.out.println(" "+map);
		
	}
}

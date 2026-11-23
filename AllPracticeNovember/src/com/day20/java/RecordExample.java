package com.day20.java;

import java.util.Map;
import java.util.stream.Collectors;

// Java 17 supports Records, which are useful for DTOs and API response objects.

record BankAccount(
		Integer accountId, 
		String accountHolder, 
		Double balance, 
		String accountType) 
{
}

public class RecordExample {

	public static void main(String[] args) {

		BankAccount account = new BankAccount(101, "Rahul", 50000.0, "Savings");

		System.out.println(account.accountHolder());
		
		System.out.println(account.balance());
		
		System.out.println(account);

	}
}


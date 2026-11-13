package com.day8.java;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

// Complex Streams & Data Aggregation

 record Transaction(String id, String category, double amount, LocalDate date) {

}

public class TransactionService {

	public Map<String, Double> getTopCategories(List<Transaction> transactions) {
		LocalDate thirtyDaysAgo = LocalDate.now().minusDays(30);

		return transactions.stream().filter(t -> 
		t.date().isAfter(thirtyDaysAgo))
				.collect(Collectors.groupingBy
						(Transaction::category, 
								Collectors.summingDouble
								(Transaction::amount)))
				.entrySet()
				.stream()
				.sorted(Map.Entry.<String, Double>
				comparingByValue().reversed())
				.collect(Collectors
						.toMap(Map.Entry::getKey, 
								Map.Entry::getValue, 
								(oldVal, newVal) -> oldVal, 
								LinkedHashMap::new));
		
	}
}

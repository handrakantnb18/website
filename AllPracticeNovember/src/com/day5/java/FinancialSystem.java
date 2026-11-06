package com.day5.java;

// Handling Complex Data Formats in a Financial System

record TransactionRecord(String transactionType, 
		double amount) {

}

public class FinancialSystem {

	private static String extracted(Object inputData) {
		String result = switch (inputData) {
		case Integer i -> "Single Integer: Processed -> " + i;
		case Double d -> "Single Double: Rounded to 2 decimal places -> " + String.format("%.2f", d);
		case int[] arr -> "Integer Array of size " + arr.length;
		case double[] arr -> "Double Array of size " + arr.length;
		case TransactionRecord(String type, double amount) -> "Transaction Type: " + type + ", Amount: " + amount;
		case String s -> "Raw Data -> " + s;
		default -> "Unsupported data type";
		};
		return result;
	}

	public static void main(String[] args) {

		System.out.println(extracted(new TransactionRecord("Credit", 1250.75)));
		System.out.println(extracted(2450.755678));
		System.out.println(extracted(new double[] { 29.57, 76.48, 92.38 }));
		System.out.println(extracted("Raw Data-1"));
		System.out.println(extracted(2450.75f));

	}
}

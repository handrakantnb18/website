package com.day24.java;

// 17 switch expressions to handle business logic such as deposits, withdrawals, and balance checks

public class BankTransaction {

	public static double processTransaction(String transactionType, double balance, double amount) {

		return switch (transactionType.toUpperCase()) {

		case "DEPOSIT" -> balance + amount;

		case "WITHDRAW" -> {
			if (amount > balance) {
				throw new RuntimeException("Insufficient balance");
			}
			yield balance - amount;
		}

		case "CHECK_BALANCE" -> balance;

		default -> throw new IllegalArgumentException("Invalid transaction type");
		};
	}

	public static void main(String[] args) {

		double balance = 50000;

		double newBalance = processTransaction("DEPOSIT", balance, 10000);

		System.out.println("New Balance: " + newBalance);

		double withdrawalBalance = processTransaction("WITHDRAW", newBalance, 5000);

		System.out.println("After Withdrawal: " + withdrawalBalance);

	}
}

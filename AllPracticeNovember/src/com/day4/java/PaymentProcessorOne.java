package com.day4.java;

// Payment Processing System– Using Multiple Data Types & guarded patterns in case labels

public class PaymentProcessorOne {

	public static String processPayment(Object payment) {
		return switch (payment) {
		case String cardDetails when cardDetails.length() == 
				16 -> "Processing card payment: " + cardDetails;
		case Double walletBalance when walletBalance >= 
				100.0 ->
			"You have sufficient balance to procced. Processing wallet payment.";
		case Double walletBalance when walletBalance < 100.0 -> "Insufficient wallet balance.";
		case Integer[] rewardPoints -> "Processing reward points: Points available - "
		+ rewardPoints.length;
		default -> "Unsupported payment data. Kindly provide valid data";
		};
	}

	public static void main(String[] args) {

		System.out.println(processPayment("1234567898765432"));
		System.out.println(processPayment(150.0));
		System.out.println(processPayment(50.0));
		System.out.println(processPayment(new Integer[] { 10, 20, 30 }));
		System.out.println(processPayment(1234));

	}
}

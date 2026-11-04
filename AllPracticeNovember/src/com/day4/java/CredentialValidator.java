package com.day4.java;

// Validate User Credentials– Using complex guards in case labels

public class CredentialValidator {

	public static String validateCredentials(String username, String password) {
		return switch (username) {
		case String u when u.startsWith("admin_")
		&& password.length() >= 8 -> 
		"Credentials are valid.";
		default -> "Invalid username or password!";
		};
	}

	public static void main(String[] args) {

		System.out.println(validateCredentials("admin_user", "strongPass"));
		System.out.println(validateCredentials("admin_user", "weak"));
		System.out.println(validateCredentials("user", "validPassword"));

	}
}

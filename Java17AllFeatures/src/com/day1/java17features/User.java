package com.day1.java17features;

public record User(String id, String name, int age) {

	public User {
		if (age < 0)
			throw new IllegalArgumentException("age must be >= 0");
	}

	public String display() {
		return name + " (" + age + ")";

	}
}

class Main {
	public static void main(String[] args) {
		var u = new User("u1", "Asha", 28);
		System.out.println(u);
		System.out.println(u.display());
	}
}

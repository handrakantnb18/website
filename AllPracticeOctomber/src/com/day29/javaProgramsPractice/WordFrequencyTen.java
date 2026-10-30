package com.day29.javaProgramsPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

// 10. Find the Frequency of Each Word in a String

public class WordFrequencyTen {

	public static void main(String[] args) {

		String str = "java spring java boot spring java";

		Map<String, Long> result = 
				Arrays.stream(str.toLowerCase()
						.split("\\s+"))
				.collect(Collectors.groupingBy(word ->
				word, Collectors.counting()));

		result.forEach((word, count) -> 
		System.out.println(word + " = " + count));

	}
}


// 1. What are the four pillars of OOPs?
// 2. What is the difference between an abstract class and an interface?
// 3. What is the difference between "==" and ".equals()" in Java?
// 4. Explain the difference between "ArrayList" and "LinkedList".
// 5. What is the difference between "HashMap" and "ConcurrentHashMap"?
// 6. Explain the "equals()" and "hashCode()" methods.
// 7. What is exception handling in Java?
// 8. What is the difference between checked and unchecked exceptions?
// 9. Explain the Java 8 features, especially Lambda expressions and Streams.
// 10. What is the difference between "map()" and "filter()" in Streams?
// 11. What is the difference between "String", "StringBuilder", and "StringBuffer"?
// 12. Explain the concept of multithreading in Java.
// 13. What are dependency injection and inversion of control in Spring Boot?
// 14. What is the difference between "@Component", "@Service", and "@Repository"?
// 15. What is REST API, and how do you handle exceptions in Spring Boot?

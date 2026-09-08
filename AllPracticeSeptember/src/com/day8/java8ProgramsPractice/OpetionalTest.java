package com.day8.java8ProgramsPractice;

import java.util.Optional;

// Optional.ofNullable() in Java 

// What it does Creates an Optional that safely handles both null and non-null values. 
//  If the value is non-null → returns an Optional containing that value 
//  If the value is null → returns an empty Optional (no exception thrown)
//  Syntax;- Optional<T> optional = Optional.ofNullable(value);
 
// When should you use Optional.ofNullable()?
// Use Optional.ofNullable() when:
// The value may or may not be null
// You're receiving data from a database, API, request, or another external source
// You want to safely wrap a potentially null value

// Quick comparison  of() vs ofNullable()
// Optional.of(value) → throws NPE if value is null 
// Optional.ofNullable(value) → returns Optional.empty() if value is null

 
public class OpetionalTest {

	public static void main(String[] args) {
		
		String name = "Ajit";
		String nullName = "";
		
		Optional<String> optional = Optional.ofNullable(name);
		System.out.println(optional.isPresent());
		
		Optional<String> empty = Optional.ofNullable(nullName);
		System.out.println(empty.isPresent());
		
		String result = empty.orElse("Default name ");
		System.out.println(result);
		
		
	}
}

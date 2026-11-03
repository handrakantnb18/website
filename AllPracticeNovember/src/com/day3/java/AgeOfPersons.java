package com.day3.java;

import java.util.Optional;

// Find the age of a person in years if the birthday has given

public class AgeOfPersons {

	public static void main(String[] args) {

		Optional<String> optionalName = 
				Optional.ofNullable("chandrakant");

		if (optionalName.isPresent()) {
			
			System.out.println("Name is present: " + optionalName.get());
		}
		else {
			
			System.out.println("Name is not present");
		}
	}
}

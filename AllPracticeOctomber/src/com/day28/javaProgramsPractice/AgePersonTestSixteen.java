package com.day28.javaProgramsPractice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Find the age of a person in years if the birthday has given

public class AgePersonTestSixteen {

	public static void main(String[] args) {

		LocalDate birthDay = LocalDate.of(1997, 13, 13);
		LocalDate today = LocalDate.now();

		System.out.println
		(ChronoUnit.YEARS.between(birthDay, today));

	}
}

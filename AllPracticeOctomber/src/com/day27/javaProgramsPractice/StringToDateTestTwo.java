package com.day27.javaProgramsPractice;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

// How to convert String to Date Object using Java 8 

public class StringToDateTestTwo {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a", Locale.ENGLISH);
		String dateInString = "24-Oct-2026 9:45:30 AM";
		Date date = dateFormatter.parse(dateInString);
		System.out.println(date);

		LocalDate localDate = LocalDate.parse("2026-10-24");
		System.out.println(localDate);

		LocalDateTime localDateTime = LocalDateTime.parse("2026-10-24T21:45:30");
		System.out.println(localDateTime);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
		ZonedDateTime zonedDateTime = ZonedDateTime.parse("2026-10-24 21:45:30 America/New_York", formatter);
		System.out.println(zonedDateTime);

	}
}

package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNotRepet {

	public static void main(String[] args) {
		
		// find first not repet String in the strings
		
		String str = "Software Engineer";
		
		String string =
				Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						LinkedHashMap::new,
						Collectors.counting()))
				.entrySet()
				.stream()
				.filter(n -> n.getValue() == 1)
				.findFirst()
				.get()
				.getKey();
		
		System.out.println(string);
		
		System.out.println("-------------------");
		
		String str1 = "Chandrakant bhosale";
		
		String string1 =
				Arrays.stream(str1.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						LinkedHashMap::new,
						Collectors.counting()))
				.entrySet()
				.stream()
				.filter(a -> a.getValue() == 1)
				.findFirst()
				.get()
				.getKey();
		
		System.out.println(string1);
		
		System.out.println("------------------------");
		
		String str2 = "Shivraj Bhosale";
		
		String string2 =
				Arrays.stream(str2.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						LinkedHashMap::new,
						Collectors.counting()))
				.entrySet()
				.stream()
				.filter(b -> b.getValue() == 1)
				.findFirst()
				.get()
				.getKey();
		
		System.out.println(string2);
		
		System.out.println("------------------------");
		
		String str3 = "Priyanka Bhosale";
		
		String string3 =
				Arrays.stream(str3.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						LinkedHashMap::new,
						Collectors.counting()))
				.entrySet()
				.stream()
				.filter(c -> c.getValue() == 1)
				.findFirst()
				.get()
				.getKey();
		
		System.out.println(string3);
	}
}

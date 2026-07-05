package com.day5.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactorFrequency {

	public static void main(String[] args) {
		
		String string1 = "chandrakant bhosale";
		
		Map<String, Long> map1 = Arrays.stream(
				string1.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		System.out.println("First String : "+map1);
		
		String string2 = "my name is chandrakant and i am from sangli";
		
		Map<String, Long> map2 = Arrays.stream(
				string2.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		System.out.println(map2);
		
		String string3 = "I am Software Engineer, and i am from sangli";
		
		Map<String, Long> map3 = 
				Arrays.stream(string3.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		System.out.println(map3);
				
				
		String string4 = "i am software engineer, complated MCA in pune";
		
		Map<String, Long> map4 = 
				Arrays.stream(string4.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		System.out.println(map4);
		
		String string5 = "How are you bro";
		
		Map<String, Long> map5 =
				Arrays.stream(string5.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		System.out.println(map5);
		
		
				
	}
}

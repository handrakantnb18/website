package com.day4.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactorFrequency {

	public static void main(String[] args) {

		// find the Charactor frequency in the String

		String str = "my name is Ram and i am stay in pune as a software engineer";

		Map<String, Long> map = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);

	}
}

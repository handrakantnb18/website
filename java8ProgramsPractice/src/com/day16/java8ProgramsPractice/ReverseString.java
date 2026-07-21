package com.day16.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		
		String str1 = "chandrakant bhosale";
		
		String rev =
				Arrays.stream(str1.split(""))
				.reduce("", (a,b) -> b+a);
		
		System.out.println(rev);
		
		System.out.println("===========================");
		
		String str2 = "who are you bro";

		String result = 
				Arrays.stream(str2.split(" "))
				.map(word -> new StringBuilder(word)
						.reverse()
						.toString())
				.collect(Collectors.joining(" "));

		System.out.println(result);

		System.out.println("=========================");

		String str3 = "Reverse String";
		
		String res =
				Arrays.stream(str3.split(" "))
				.map(x -> new StringBuilder(x)
						.reverse()
						.toString())
				.collect(Collectors.joining(" "));
		
		System.out.println(res);
		
		System.out.println("=======================");
		
		String str4 = "my name is chandrakant";
		
		String rv =
				Arrays.stream(str4.split(" "))
				.map(y -> new StringBuilder(y)
						.reverse()
						.toString())
				.collect(Collectors.joining(" "));
		
		System.out.println(rv);
		
	}
}

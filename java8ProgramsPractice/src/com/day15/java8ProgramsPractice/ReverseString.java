package com.day15.java8ProgramsPractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {

		String str5 = "who are you bro";

		String result = 
				Arrays.stream(str5.split(" "))
				.map(word -> new StringBuilder(word)
						.reverse()
						.toString())
				.collect(Collectors.joining(" "));

		System.out.println(result);

		System.out.println("=========================");

		String s = "Reverse Each Word in a Sentence";
		
		String res =
				Arrays.stream(s.split(" "))
				.map(re -> new StringBuilder(re)
						.reverse()
						.toString())
						.collect(Collectors.joining(" "));
		
		System.out.println(res);
		
		System.out.println("============================");
		
		
		String str = "I am from sangli";

		String rev = 
				Arrays.stream(str.split(""))
				.reduce("", (a, b) -> b + a);

		System.out.println(rev);

		System.out.println("============================");
		String str1 = "chandrakant Nana Bhosale";

		String rev1 = 
				Arrays.stream(str1.split(""))
				.reduce("", (x, y) -> y + x);

		System.out.println(rev1);

		System.out.println("===========================");

		String str2 = "how are you";

		String rev2 = 
				Arrays.stream(str2.split(""))
				.reduce("", (p, q) -> q + p);

		System.out.println(rev2);

		System.out.println("============================");

		String str3 = "welcome to software development";

		String rev4 = 
				Arrays.stream(str3.split(""))
				.reduce("", (d, e) -> e + d);

		System.out.println(rev4);
	}
}

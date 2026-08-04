package com.day3.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamParallelStreamTest {

	// lets use map() to convert list of fruit
	public static void main(String[] args) {
		
		ArrayList<String> f = new ArrayList<String>();
		f.add("Apple");
		f.add("mango");
		f.add("Kivi");
		f.add("banana");
		
		System.out.println("List of Fruits : "+f);
		
		List list = f.stream()
		.map(s -> s.length())
		.collect(Collectors.toList());
		
		System.out.println("List of map "+list);
		
	}
}

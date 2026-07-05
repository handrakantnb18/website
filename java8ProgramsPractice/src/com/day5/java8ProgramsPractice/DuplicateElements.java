package com.day5.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		System.out.println("First List : ");
		List<Integer> list1 = Arrays.asList(
				1,5,9,7,8,1,5,6,3,4,8,9,10);
		
		Set<Integer> set1 = new HashSet<Integer>(); 
		
		list1.stream()
		.filter(d1 -> !set1.add(d1))
		.forEach(System.out::println);
		
		System.out.println("Second List : ");
		List<Integer> list2 = Arrays.asList(
				7,89,5,2,3,5,4,1,5,89,3,7,1);
		
		Set<Integer> set2 = new HashSet<Integer>();
		
		list2.stream()
		.filter(d2 -> !set2.add(d2))
		.forEach(System.out::println);
		
		System.out.println("Third List : ");
		List<Integer> list3 = Arrays.asList(
				8,3,5,4,8,3,1,9,6,5,7,1,9);
		
		Set<Integer> set3 = new HashSet<Integer>();
		
		list3.stream()
		.filter(d3 -> !set3.add(d3))
		.forEach(System.out::println);
		
		System.out.println("Fourth List : ");
		List<Integer> list4 = Arrays.asList(
				9,5,1,3,5,7,8,2,6,4);
		
		Set<Integer> set4 = new HashSet<Integer>();
		
		list3.stream()
		.filter(d4 -> !set4.add(d4))
		.forEach(System.out::println);
		
	}
}

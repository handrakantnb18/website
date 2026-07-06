package com.day6.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		
		System.out.println("First List : ");
		List<Integer> list1 = Arrays.asList(
				4,5,8,7,9,5,2,4,3,2,15,7,8);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list1.stream()
		.filter(d1 -> !set.add(d1))
		.forEach(System.out::println);
		
		System.out.println("Second List : ");
		
		List<Integer> list2 = Arrays.asList(
				7,8,9,6,5,2,4,2,3,5);
		
		Set<Integer> set2 = new HashSet<Integer>();
		
		list2.stream()
		.filter(d2 -> !set2.add(d2))
		.forEach(System.out::println);
		
		System.out.println("Third List : ");
		
		List<Integer> list3 = Arrays.asList(
				7,8,9,5,6,5,4,2,9,8);
		
		Set<Integer> set3 = new HashSet<Integer>();
		
		list3.stream()
		.filter(d3 -> !set3.add(d3))
		.forEach(System.out::println);
		
		System.out.println("Fourth List : ");
		
		List<Integer> list4 = Arrays.asList(
				2,8,7,9,5,9,7,5,26,4,2,6,4);
		
		Set<Integer> set4 = new HashSet<Integer>();
		
		list4.stream()
		.filter(d4 -> !set4.add(d4))
		.forEach(System.out::println);
		
		System.out.println("Fifth List : ");
		
		List<Integer> list5 = Arrays.asList(
				7,8,9,6,5,2,3,5,8,9,7);
		
		Set<Integer> set5 = new HashSet<Integer>();
		
		list5.stream()
		.filter(d5 -> !set5.add(d5))
		.forEach(System.out::println);
		
	}
}

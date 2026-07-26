package com.day20.java8ProgramsPractice;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenOddNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(18,23,25,74,89,
				99,23,14,26,77,22,46);
		
		Map<Boolean, List<Integer>> oddEvenNum = 
				list.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));
		
		Set<java.util.Map.Entry<Boolean, List<Integer>>> entrySet = oddEvenNum.entrySet();
		
		for(java.util.Map.Entry<Boolean, List<Integer>> entry : entrySet)
		{
			System.out.println("--------------------");
			
			if(entry.getKey())
			{
				System.out.println("Even Numbers : ");
			}
			else
			{
				System.out.println("Odd Numbers : ");
			}
			
			System.out.println("-----------------------");
			
			List<Integer> list1 = entry.getValue();
			
			for(int i : list1)
			{
				System.out.println(i);
			}
		}
		
	}
}

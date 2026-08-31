package com.day31.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class FindNumber {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				10,20,6,30,40,6,50);
		
		num.forEach(n -> {
			if(n == 6) 
				System.out.println("Number 6 found");
		});
	}
}

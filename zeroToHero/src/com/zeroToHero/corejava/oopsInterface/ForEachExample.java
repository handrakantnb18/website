package com.zeroToHero.corejava.oopsInterface;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(
				"Ram", "Rahul", "Amit", "Pooja", "Chandrakant", "Shivraj");
		
		list.forEach(name -> System.out.println(name));
		
	}
}

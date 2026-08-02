package com.zeroToHero.corejava.oopsInterface;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressionPredicate {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(
				"Chandrakant", "Pooja", "Shivraj", "Priyanka", "Vijay");
		
		System.out.println("Languages that starts with 'P' :");
		filter(list, (str) -> str.startsWith("P"));  
			
	}
	
	public static void filter(List<String> name, Predicate<String> condition)
	{
		for(String names: name)
		{
			if(condition.test(names)) {
				System.out.println(names + " ");
			}
		}
	}
}

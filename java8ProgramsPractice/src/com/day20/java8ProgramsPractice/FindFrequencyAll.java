package com.day20.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyAll {

	public static void main(String[] args) {
		
        List<String> list = Arrays.asList
        		("Pen", "Eraser", "Note Book", "Pen",
        				"Pencil", "Stapler", "Note Book", "Pencil");
        
        Map<String, Long> countMap = 
                list.stream()
                .collect(Collectors.groupingBy(
                		Function.identity(),
                		Collectors.counting()));
        
        System.out.println(countMap);
         
	}
}

package com.day20.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElaments {

	public static void main(String[] args) {
		
        List<Integer> list = 
        		Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
    
        Set<Integer> set = new HashSet<Integer>();
        
        Set<Integer> duplicate = list.stream()
        		.filter(i -> !set.add(i))
        		.collect(Collectors.toSet());
        
        System.out.println(duplicate);
        
	}
}

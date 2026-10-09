package com.day6.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;

//Parallel Streams are the type of streams that can 
//perform operations concurrently on multiple threads

public class Stream8TestFour {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);

        num.parallelStream()
        .forEach(n -> System.out.println(
        		n + " " + Thread.currentThread()
        		.getName()));
        
	}
}

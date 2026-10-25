package com.day25.javaProgramsPractice;

import java.util.*;

// 5. Given a list of integers, find the total number of elements present in the list using Stream functions?

public class ListIntegersFive {

	public static void main(String[] args) {
		
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
         long count =  myList.stream()
                             .count();
         System.out.println(count);   
         
         // When numbers are given as Array
         
        // int[] arr = {10,15,8,49,25,98,98,32,15};
         
      // Arrays.stream(arr).boxed().count();  
         
	}
}

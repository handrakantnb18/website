package com.day2.javaProgramsPractice;

import java.util.HashSet;
import java.util.Set;

//it does not allow duplicate values.
//The set interface provides efficient search, insertion, and deletion operations.

public class SetListTestOne {

	public static void main(String[] args) {
		
		Set<String> str = new HashSet<String>();
		
		System.out.println("Elements : "+str);
	}
}

package com.day5.javaProgramsPractice;

import java.util.HashSet;
import java.util.Set;

// To add elements to a Set in Java, use the add() method.

public class SetInterfaceTestOne {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("B");
        set.add("B");
        set.add("C");
        set.add("A");
        set.add("B");
        set.add("B");
        set.add("C");
        set.add("A");
        
        System.out.println(set);        
	}
}

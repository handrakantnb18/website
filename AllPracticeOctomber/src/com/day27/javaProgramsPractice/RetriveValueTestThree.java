package com.day27.javaProgramsPractice;

import java.util.*;
import java.util.stream.Stream;

// How to retrieve values from Set using Java 8 

public class RetriveValueTestThree {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
        set.add("1. Mumbai");
        set.add("2. Pune");
        set.add("3. Delhi");
        set.add("4. Kolkatta");
        set.add("5. Banglore");
        set.add("6. Chennai");
        set.add("7. Goa");

        Stream<String> stream = set.stream();
        stream.forEach((element) ->
        { System.out.println(element); });
     
	}
}

package com.day21.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class GenericMapHashMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rajat");
		map.put(103, "Sunil");
		
		for(Map.Entry m:map.entrySet()) {
			
			System.out.println(m.getKey()+" = "+m.getValue());
			
		}
	}
}

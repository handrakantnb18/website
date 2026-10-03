package com.day2.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

//There are multiple ways to iterate through the Map.
//The most famous way is to use a for-each loop and get the keys
//The value of the key is found by using the getValue() method. 

public class MapHashTestFour {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(new Integer(1), "Amit");
		map.put(new Integer(2), "Raju");
		map.put(new Integer(3), "Pooja");
		map.put(new Integer(4), "Ajit");
		map.put(new Integer(5), "Chandu");
		map.put(new Integer(6), "Priya");
		map.put(new Integer(7), "Pravin");
		map.put(new Integer(8), "Pramod");
		map.put(new Integer(9), "neeta");
		
		for (Map.Entry mapEle : map.entrySet()) {
			int key = (int) mapEle.getKey();
			
			String value = (String) mapEle.getValue();
			
			System.out.println(key+" "+value);
			
		}
		
	}
}

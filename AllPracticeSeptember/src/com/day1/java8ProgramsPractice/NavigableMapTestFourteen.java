package com.day1.java8ProgramsPractice;

import java.util.SortedMap;
import java.util.TreeMap;

// how to use SortedMap methods like headMap(), tailMap(), and subMap().

public class NavigableMapTestFourteen {

	public static void main(String[] args) {

		SortedMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");

		System.out.println("HeadMap: "+map.headMap(102));
		
		System.out.println("TailMap: "+map.tailMap(102)); 
		
		System.out.println("SubMap: "+map.subMap(100, 102));
		
		
	}
}

package com.day17.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// There are multiple ways to iterate through the Map
// The most famous way is to use a for-each loop and get the keys

public class HashMapTestFour {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(new Integer(1), "Ameer");
		map1.put(new Integer(101), " 1. Ajit");
		map1.put(new Integer(102), " 2. Rahul");
		map1.put(new Integer(103), " 3. Ram");
		map1.put(new Integer(104), " 4. Amit");
		map1.put(new Integer(105), "5. Shivraj");
		map1.put(new Integer(106), " 6. Chandrakaant");
		map1.put(new Integer(107), "7. Priyankaa");

		for (Map.Entry ele : map1.entrySet()) {
			int key = (int) ele.getKey();

			String value = (String) ele.getValue();

			System.out.println(key + " " + value);

		}

	}
}

package com.day17.javaProgramsPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// There are various ways to iterate through a map

public class MapTestFour {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println("Traversing using for-each loop");

		hm.put(1, "Chandrakant");
		hm.put(2, "Shivraj");
		hm.put(3, "Keshav");
		hm.put(0, "Priyanka");

		for (Map.Entry mapEle : hm.entrySet()) {
			int key = (int) mapEle.getKey();

			String val = (String) mapEle.getValue();
			System.out.println(key + ": " + val);
		}
		System.out.println();
		System.out.println("Traversing using an iterator");

		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {

			Map.Entry en = (Map.Entry) itr.next();
			System.out.println(en.getKey() + ": " + en.getValue());
		}

	}
}

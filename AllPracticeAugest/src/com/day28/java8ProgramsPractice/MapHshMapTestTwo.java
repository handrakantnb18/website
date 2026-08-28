package com.day28.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class MapHshMapTestTwo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		// Initialization of a Map : Inserting elements
		map.put(101, "Apple");
		map.put(102, "Mango");
		map.put(103, "Orenge");
		map.put(104, "Graps");
		map.put(105, "Banana");
		
		// Inserting elements — no need to use new Integer()
		map1.put(101, "Ajay");
		map1.put(102, "Mahesh");
		map1.put(103, "Oreen");
		map1.put(104, "Ganesh");
		map1.put(105, "Balu");
		
		System.out.println(map);
		System.out.println(map1);
		
		// Changing Element : To update a value,
		// Inserting the Elements
		map1.put(new Integer(101), "Amit");
		map1.put(new Integer(102), "Manav");
		
		map1.put(new Integer(103), "Ollev");
		System.out.println("Initial Map : "+map1);
		
		// updated
		map1.put(new Integer(102), "Manisha");
		
		System.out.println("Updated Map : "+map1);
		
		// Removing Elements : This method takes the key value and removes
		
		map1.remove(new Integer(1));
		
		System.out.println(map1);
		
		// Iterating through the Map
		
		for (Map.Entry mapElement : map1.entrySet()) {
			int key = (int)mapElement.getKey();
			
			String value = (String)mapElement.getValue();
			
			System.out.println(key+" "+value);
			
		}
		
		
		 
	}
}

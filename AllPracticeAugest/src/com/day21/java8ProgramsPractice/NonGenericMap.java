package com.day21.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NonGenericMap {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		map.put(1, "Rahul");
		map.put(2, "Ajit");
		map.put(3, "Anil");
		map.put(4, "Pooja");
		map.put(5, "Ram");
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+ " "+entry.getValue());
			
		}
		
	}
}

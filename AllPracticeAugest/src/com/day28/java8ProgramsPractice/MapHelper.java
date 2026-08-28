package com.day28.java8ProgramsPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapHelper implements Runnable {

	Map<String, Integer> map;
	
	public MapHelper(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "MapHealper").start();
	}
	
	public void run() {
		map.put("One", 1);
		
		try {
			System.out.println("MapHealper");
			Thread.sleep(10000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		
		Map<String, Integer> syncMap = 
				Collections.synchronizedMap(hashMap);
		
		MapHelper mapHelper = new MapHelper(syncMap);
		MapHelper mapHelper2 = new MapHelper(syncMap);
		MapHelper mapHelper3 = new MapHelper(syncMap);
		MapHelper mapHelper4 = new MapHelper(syncMap);
		
		for(Map.Entry<String, Integer> e : syncMap.entrySet()) {
			System.out.println(e.getKey()+ " = "+e.getValue());
			
		}
	}
}

package com.day4.java8ProgramsPractice;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {

		// ConcurrentHashMap<Integer, String> map = new ConcurrentHashMapDemo();

		// ConcurrentHashMap is a thread-safe implementation of the Map interface that
		// allows multiple threads to access and modify the map concurrently without
		// locking the entire map
		// Does not allow null keys or null values.

		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();

		map.put(1, "Chandrakant");
		map.put(2, "Shivraj");
		map.put(3, "Priyanka");
		map.put(4, "Bhosale");

		System.out.println(map);

	}
}

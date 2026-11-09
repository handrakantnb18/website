package com.day7.java;

import java.util.*;

//  Write a Java program to implement a simple LRU (Least Recently Used) Cache

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

	private final int capacity;

	public LRUCache(int capacity) {
		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > capacity;
	}

	public static void main(String[] args) {
		LRUCache<Integer, String> cache = new LRUCache<>(3);
		cache.put(1, "A");
		cache.put(2, "B");
		cache.put(3, "C");
		cache.put(4, "D"); 
		System.out.println(cache);
	}

}

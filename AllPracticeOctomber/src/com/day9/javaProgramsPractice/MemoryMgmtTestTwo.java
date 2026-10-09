package com.day9.javaProgramsPractice;

//program demonstrates the relationship between class-level data, objects, and method execution

public class MemoryMgmtTestTwo {

	static int v = 100;

	int i = 10;

	public void display() {
		int s = 20;

		System.out.println(v);
		System.out.println(i);
		System.out.println(s);
	}

	public static void main(String[] args) {

		MemoryMgmtTestTwo name = new MemoryMgmtTestTwo();
		name.display();

	}
}

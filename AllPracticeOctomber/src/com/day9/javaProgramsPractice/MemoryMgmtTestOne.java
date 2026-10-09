package com.day9.javaProgramsPractice;

//local variables are stored in the Stack
//to demonstrate how java variables are stored in the different memory areas

public class MemoryMgmtTestOne {

	static int v = 100;

	int i = 10;

	public void Display() {

		int s = 20;

		System.out.println(v);
		System.out.println(s);
	}

	public static void main(String[] args) {

		MemoryMgmtTestOne mone = new MemoryMgmtTestOne();
		mone.Display();
	}
}

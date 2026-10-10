package com.day10.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collection;

// the add(E e) method for a single element or addAll(Collection c) to add multiple

public class CollectionInterfaceTestTwo {

	public static void main(String[] args) {

		Collection<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);

		Collection<Integer> moreNumbers = new ArrayList<>();
		moreNumbers.add(70);
		moreNumbers.add(80);

		num.addAll(moreNumbers);

		System.out.println("After Adding Elements : " + num);

	}
}

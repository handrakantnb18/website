package com.day14.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;

// Randomly shuffle an ArrayList

public class MapIteratorTestNine {

	public static void main(String[] args) {

		ArrayList<String> cards = new ArrayList<>();
		cards.add("Ace");
		cards.add("King");
		cards.add("Queen");
		cards.add("Jack");

		Collections.shuffle(cards);
		System.out.println(cards);

	}
}

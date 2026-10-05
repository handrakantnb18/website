package com.day4.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// Collection interface does not provide index-based access to elements

public class ColoursElementsTestFour {

	public static void main(String[] args) {
		
		List<String> col = new ArrayList<String>();
		col.add("Red");
		col.add("Yellow");
		col.add("Blue");
		col.add("Green");
		col.add("Black");
		col.add("White");
		
		System.out.println("Colours list : "+col);
		
		String firstColour = col.get(0);
		String lastColour = col.get(col.size() - 1);
		
		System.out.println("First colour : "+firstColour);
		
		System.out.println("Last colour : "+lastColour);
		
	}
}

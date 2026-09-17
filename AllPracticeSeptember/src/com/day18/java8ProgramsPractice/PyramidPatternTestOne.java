package com.day18.java8ProgramsPractice;

// A Pyramid Number Pattern is a popular pattern-printing 
// problem in Java that helps beginners understand nested 
// loops, spacing, and number manipulation.

public class PyramidPatternTestOne {

	public static void main(String[] args) {
		
		int row = 5;
		
		for (int i = 1; i <= row; i++)
		{
			for (int j = i; j < row; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print((i + j) + " ");
			}
			
			for (int j = i - 2; j >= 0; j--) {
				System.out.print((i + j) +" ");
			}
			
			System.out.println();
		}
	}
}

//    Input: Rows = 5  
//
//    Output:          1
//                   2 3 2
//               3 4 5 4 3
//           4 5 6 7 6 5 4
//        5 6 7 8 9 8 7 6 5

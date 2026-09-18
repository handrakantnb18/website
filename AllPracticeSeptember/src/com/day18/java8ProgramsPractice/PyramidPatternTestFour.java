package com.day18.java8ProgramsPractice;

// Let n be the number of rows to be printed
// Use outer iteration a from 0 to k times to print the rows
// Make inner iteration for b from 0 to (K – 1).
// Then print space as " “.
// Close the inner 'b' loop.
// Make inner iteration for b from '0' to 'a'.
// Output nCr of 'a' and 'b'.
// Close inner loop.
// Print newline character (\n) after each inner iteration.

// Method 1 may fail for larger values of k (e.g., k ≥ 13) due
// to integer overflow in factorial calculations. To handle 
// larger values, use long, BigInteger, or the binomial  
// coefficient approach (Method 2).

public class PyramidPatternTestFour {

	public int factorial(int a) {

		if (a == 0)

			return 1;

		return a * factorial(a - 1);
	}

	public static void main(String[] args) {

		int k = 4;

		int a, b;

		PyramidPatternTestFour pattern = new PyramidPatternTestFour();

		for (a = 0; a <= k; a++) {
		
			for (b = 0; b <= k - a; b++ ) {
			
				System.out.print(" ");
			}
			
			for ( b= 0; b <= a; b++) {
				System.out.print(" "+pattern.factorial(a) /
						(pattern.factorial(a - b)
								* pattern.factorial(b))
						);
			}
			
			System.out.println();
			
		}
	}
}


//		Output
//		
//		    1
//		   1 1
//		  1 2 1
//		 1 3 3 1
//		1 4 6 4 1

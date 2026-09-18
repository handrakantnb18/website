package com.day18.java8ProgramsPractice;

// The 'A'th entry in a line number line is Binomial 
// Coefficient C(line, a) and all lines start with value 1
// The idea is to calculate C(line, a) using C(line, a-1)

public class PyramidPatternTestFive {

	public static void printPascal(int k)
    {
        for (int line = 1; line <= k; line++) {
            for (int b = 0; b <= k - line; b++) {

            	System.out.print(" ");
            }
            
            int C = 1;

            for (int a = 1; a <= line; a++) {
            	
            	System.out.print(C + " ");
                
                C = C * (line - a) / a;
                
            }
            
            System.out.println();
        }
    }
	
	public static void main(String[] args) {
		
		int n = 6;
		
		printPascal(n);
		
	}
}


//  output

//		     1 
//		    1 1 
//		   1 2 1 
//		  1 3 3 1 
//		 1 4 6 4 1 
//		1 5 10 10 5 1 
//		

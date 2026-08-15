package com.zeroToHero.exception;

import java.util.concurrent.RecursiveAction;

// StackOverflowError caused by recursion and OutOfMemoryError caused by excessive memory allocation.
public class ErrorStackOverFlow {

	//StackOverflowError
	public static void recursiveCall() {
			recursiveCall();
		}
			
	public static void main(String[] args) {
		
		// StackOverflowError
		try {
			recursiveCall();
		}catch(StackOverflowError e) {
			System.out.println("Catch StackOverFlowError : "+e.getMessage());
		}
		
		// OutOfMemoryError 
		try {
			int[] largeArray = new int[Integer.MAX_VALUE];
		}catch(OutOfMemoryError e) {
			System.out.println("OutOfMemoryError : "+e.getMessage());
		}
		
	}
}

package com.day18.java8ProgramsPractice;

interface FuncInteface
{
	void abstractFun(int x);
	
		default void normalFun()
		{
			System.out.println("Chandr");
		}
	}


public class FunctionalInLambda {

	public static void main(String[] args) {
		
		FuncInteface fobj = 
				(int x) -> System.out.println(2 * x);
		fobj.abstractFun(5);
	}
}

package com.day2.java8ProgramsPractice;

public interface Generics<T, U> {

	void add(T t1, U u1);
	
	// generics type
	public static void main(String[] args) {
		
		Generics<Integer, String> g = (i, j) ->
		{
			System.out.print(i+ " ");
			System.out.print(j);
		};
		
		g.add(10, "Chandrakant");
		
		Generics<String, String> g1 = (i, j) ->
		{
			System.out.print(i);
			System.out.print(j);
		};
		
		g1.add(" Priyanka", " Shivraj");
		
	}
}

package com.day5.java17features;

// without lambda, Drawable implementation using anonymous class 

interface Drawable {
	public void draw();
}

public class LambdaExprDraw {

	public static void main(String[] args) {
		
		int width = 10;
		
		 Drawable d=new Drawable(){  
	            public void draw(){System.out.println("Drawing "+width);}  
	        };  
	        d.draw();  
	}
}

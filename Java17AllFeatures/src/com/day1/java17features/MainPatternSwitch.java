package com.day1.java17features;

public class MainPatternSwitch {

	static String KindOf(Object obj) {
		return switch (obj) {
		 case null           -> "null";
         case String s       -> "String(%d)".formatted(s.length());
         case Integer i      -> "int:" + i;
         //case Double d && d.isNaN() -> "NaN";
         case Double d       -> "double:" + d;
         default             -> "Something else";
		};
	}
	
	public static void main(String[] args) {
		
		System.out.println(KindOf("Javaprogramming"));
		System.out.println(KindOf(5));
		System.out.println(KindOf(5.5));
	}
}

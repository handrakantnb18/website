package com.zeroToHero.exception;


//class UserDefinedException extends Exception {
//	
//	public UserDefinedException(String str) {
//		super(str);
//	}
//}


// throw an object of user user-defined exception 
public class UserDefinedExceptionCustom {

	public static void main(String[] args) {
		
		try {
			throw new UserDefinedException("This in User-Defined Exception");
		}
		catch(UserDefinedException u) {
			System.out.println(u.getMessage());
		}
	}
}

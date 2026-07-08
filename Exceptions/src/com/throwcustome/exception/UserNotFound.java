package com.throwcustome.exception;

import com.allcustome.exceptions.UserNotFoundException;
import java.util.Scanner;

public class UserNotFound {

    void userNotFound() throws UserNotFoundException {

        Scanner scr = new Scanner(System.in);

        System.out.print("Enter User Name: ");

        String name = scr.next();

        if ("chandr".equals(name)) {
            System.out.println("User Found");
        } else {
            throw new UserNotFoundException("User Not Found");
        }

        scr.close();
    }
    

	public static void main(String[] args) {
		
		UserNotFound unf = new UserNotFound();
		
		try
		{
			unf.userNotFound();
		}
		catch(UserNotFoundException u)
		{
			System.out.println(u.getMessage());
		}
		
	}
}

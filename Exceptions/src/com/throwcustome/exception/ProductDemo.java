package com.throwcustome.exception;

import com.allcustome.exceptions.ProductNotFoundException;
import java.util.Scanner;

public class ProductDemo {

	
    void productFound() throws ProductNotFoundException {

        Scanner scr = new Scanner(System.in);

        System.out.print("Enter Product Name: ");

        String name1 = scr.next();

        if ("mobile".equals(name1)) {
            System.out.println("Product Found");
        } else {
            throw new ProductNotFoundException("Product Not Found");
        }

        scr.close();
    }

	
	
	public static void main(String[] args) {
		
		ProductDemo pd = new ProductDemo();
		
		try
		{
			pd.productFound();
		}
		catch(ProductNotFoundException p)
		{
			System.out.println(p.getMessage());
		}
		
	}
}

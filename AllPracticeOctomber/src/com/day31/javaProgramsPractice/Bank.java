package com.day31.javaProgramsPractice;

// Bank Customer class with 7 variables, sample customer data, and the code

public class Bank {

	private Integer bid;

	private String bname;

	private String bemail;

	private Double balance;

	private String bcity;

	private String bbranch;

	private String bdesc;

	@Override
    public String toString() {
        return "Bank{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", bemail='" + bemail + '\'' +
                ", balance=" + balance +
                ", bcity='" + bcity + '\'' +
                ", bbranch='" + bbranch + '\'' +
                ", bdesc='" + bdesc + '\'' +
                '}';
    }

	
}

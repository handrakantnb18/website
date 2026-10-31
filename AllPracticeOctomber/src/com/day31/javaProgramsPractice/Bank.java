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

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBemail() {
		return bemail;
	}

	public void setBemail(String bemail) {
		this.bemail = bemail;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getBcity() {
		return bcity;
	}

	public void setBcity(String bcity) {
		this.bcity = bcity;
	}

	public String getBbranch() {
		return bbranch;
	}

	public void setBbranch(String bbranch) {
		this.bbranch = bbranch;
	}

	public String getBdesc() {
		return bdesc;
	}

	public void setBdesc(String bdesc) {
		this.bdesc = bdesc;
	}

	public Bank(Integer bid, String bname, String bemail, Double balance, String bcity, String bbranch, String bdesc) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bemail = bemail;
		this.balance = balance;
		this.bcity = bcity;
		this.bbranch = bbranch;
		this.bdesc = bdesc;
	}

	public Bank() {
		super();
		
	}

}

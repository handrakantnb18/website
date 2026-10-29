package com.day29.javaProgramsPractice;

public class Product {

	private Integer pid;

	private String pname;

	private String pemail;

	private Double pprice;

	private String pcity;

	private String pdesc;

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pemail=" + pemail + ", pprice=" + pprice + ", pcity="
				+ pcity + ", pdesc=" + pdesc + "]";
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public Double getPprice() {
		return pprice;
	}

	public void setPprice(Double pprice) {
		this.pprice = pprice;
	}

	public String getPcity() {
		return pcity;
	}

	public void setPcity(String pcity) {
		this.pcity = pcity;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public Product(Integer pid, String pname, String pemail, Double pprice, String pcity, String pdesc) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pemail = pemail;
		this.pprice = pprice;
		this.pcity = pcity;
		this.pdesc = pdesc;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

package com.day30.javaProgramsPractice;

public class ProductFind {

	private Integer pid;
	
	private String pname;
	
	private String pemail;
	
	private Double price;
	
	private String prodctType;
	
	private String pcity;
	
	private String branch;

	@Override
	public String toString() {
		return "ProductFind [pid=" + pid + ", pname=" + pname + ", pemail=" + pemail + ", price=" + price
				+ ", prodctType=" + prodctType + ", pcity=" + pcity + ", branch=" + branch + "]";
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProdctType() {
		return prodctType;
	}

	public void setProdctType(String prodctType) {
		this.prodctType = prodctType;
	}

	public String getPcity() {
		return pcity;
	}

	public void setPcity(String pcity) {
		this.pcity = pcity;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public ProductFind(Integer pid, String pname, String pemail, Double price, String prodctType, String pcity,
			String branch) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pemail = pemail;
		this.price = price;
		this.prodctType = prodctType;
		this.pcity = pcity;
		this.branch = branch;
	}
	
	
	
}

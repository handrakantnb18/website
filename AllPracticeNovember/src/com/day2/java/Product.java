package com.day2.java;

public class Product {

	private Integer pid;
	
    private String pname;
    
    private String pemail;
    
    private Double price;
    
    private String productType;
    
    private String city;
    
    private String branch;
    
    private Integer quantity;

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pemail=" + pemail + ", price=" + price + ", productType="
				+ productType + ", city=" + city + ", branch=" + branch + ", quantity=" + quantity + "]";
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

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product(Integer pid, String pname, String pemail, Double price, String productType, String city,
			String branch, Integer quantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pemail = pemail;
		this.price = price;
		this.productType = productType;
		this.city = city;
		this.branch = branch;
		this.quantity = quantity;
	}
	
	
	
}

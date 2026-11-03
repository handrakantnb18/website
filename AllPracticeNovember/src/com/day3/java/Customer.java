package com.day3.java;

public class Customer {

private Integer cid;
	
    private String cname;
    
    private String cemail;
    
    private Double price;
    
    private String customerType;
    
    private String city;
    
    private String branch;
    
    private Integer quantity;

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + ", price=" + price
				+ ", customerType=" + customerType + ", city=" + city + ", branch=" + branch + ", quantity=" + quantity
				+ "]";
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
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

	public Customer(Integer cid, String cname, String cemail, Double price, String customerType, String city,
			String branch, Integer quantity) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cemail = cemail;
		this.price = price;
		this.customerType = customerType;
		this.city = city;
		this.branch = branch;
		this.quantity = quantity;
	}
    
    
    
    
}

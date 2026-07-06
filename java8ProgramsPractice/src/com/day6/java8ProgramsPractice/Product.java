package com.day6.java8ProgramsPractice;

public class Product {

	private Integer id;
	
	private String name;
	
	private String address;
	
	private String mobileNo;

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}

	public Product(Integer id, String name, String address, String mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

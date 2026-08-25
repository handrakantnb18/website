package com.day25.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String city;
	
	private Double salary;
	
	private String email;
	
	private String dept;
	
	private String mobileNo;
	
	private String age;
	
	private String gender;
	
	private String designation;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + ", email=" + email
				+ ", dept=" + dept + ", mobileNo=" + mobileNo + ", age=" + age + ", gender=" + gender + ", designation="
				+ designation + "]";
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employee(Integer id, String name, String city, Double salary, String email, String dept, String mobileNo,
			String age, String gender, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.email = email;
		this.dept = dept;
		this.mobileNo = mobileNo;
		this.age = age;
		this.gender = gender;
		this.designation = designation;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

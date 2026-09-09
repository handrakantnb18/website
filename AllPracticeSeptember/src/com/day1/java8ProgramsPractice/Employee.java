package com.day1.java8ProgramsPractice;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private String dept;
	
	private Double salary;
	
	private String address;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", dept=" + dept + ", salary=" + salary
				+ ", address=" + address + "]";
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee(Integer id, String name, String email, String dept, Double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dept = dept;
		this.salary = salary;
		this.address = address;
	}
	
	
}

/*
 * How was my Walk-in Drive experience at Capgemini?
 * 
 * Total Sections - L1,L2 and HR Time for each sections = 30 to 40 minutes Mode
 * - F2F( Face to Face) Drive Date - 5th Sept 2026 Role - Java Backend/ Java
 * full stack( Angular/React) Exp - 4 to 10 years
 * 
 * L1 Round -
 * 
 * 1. Tell me about your self 2. What is Springboot vs microservices difference?
 * 3. When will you use microservices and when will you monolithic services
 * based architecture? 4. What is @component, @service and @repository
 * annotation does and what happens behind? 5. Where are beans stored once they
 * are invoked? 6. What is Spring IOC Container and how it stores the beans? 7.
 * Write a normal REST API which shows @controller, @service and @repository
 * whole flow? 8.What is component scan? Let's say I don't want to include any
 * class as spring oriented so how to exclude it ? 9. What is Null pointer
 * Exception? Have you ever faced in your project? 10. What is ArrayoutofBound
 * Exception? 11. Why is String Immutable in nature? Explain Heap Memory and
 * String pool? 12. Why do we use Optional and What are methods to prevent Null
 * pointer exception?
 * 
 * L2 Round -
 * 
 * 1. Tell me about your project and roles and responsibilities? 2. Have you
 * used java 21 in your projects? 3. How much are you comfortable in Java8? 4.
 * What is functional Interface? Difference between Abstract vs Static methods.
 * 5. What is difference between Consumer vs Predicate? 6. Difference between
 * ArrayList vs LinkedList? 7. What is Has-a relationship vs Is-a-relationship?
 * 8. Why String is Immutable with example? 9. Difference between ArrayList vs
 * Linkedinlist. 10. What are Marker Interfaces? What are built-in methods? 11.
 * Write a Dynamic Forms in Angular using Template driven or Reactive Forms.
 * 
 */

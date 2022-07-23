package com.bean;

public class StudentBean {
	private String firstname,lastName;
	
// constructor
	public StudentBean() {
		System.out.println("StudentBean Constructor");
	}
	
	
// init method
	public void initMethod() {
		firstname="mohit";
		lastName="patel";
	}
	
	public void destroyMethod() {
		System.out.println("destroy()");
	}
	
// default method	
	public void init1() {
		firstname="devarsh";
		lastName="patel";
	}
	
	public void destroy1() {
		System.out.println("destroy()");
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}

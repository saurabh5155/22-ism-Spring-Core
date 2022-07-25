package com.bean;

public class Address2Bean {
	String areaName;
	String city;
	int pincode;
	
	public Address2Bean() {
		System.out.println("Constructor -> Address2Bean()");
	}
	
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}

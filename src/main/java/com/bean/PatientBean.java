package com.bean;

public class PatientBean {
	Address2Bean address2Bean;
	String ptName;
	
	public PatientBean() {
		System.out.println("Constructor -> PatientBean()");
	}
	
	public Address2Bean getAddress2Bean() {
		return address2Bean;
	}
	public void setAddress2Bean(Address2Bean address2Bean) {
		this.address2Bean = address2Bean;
	}
	public String getPtName() {
		return ptName;
	}
	public void setPtName(String ptName) {
		this.ptName = ptName;
	}
	
}

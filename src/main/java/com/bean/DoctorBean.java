package com.bean;

public class DoctorBean {
	AddressBean addressBean;
	String docName;

//constructor injection
	public DoctorBean(AddressBean addressBean) {
		this.addressBean = addressBean;
		System.out.println("Constructor ->  DoctorBean(AddressBean addressBean) ");
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

}

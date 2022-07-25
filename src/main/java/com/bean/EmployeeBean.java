package com.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeBean implements InitializingBean,DisposableBean {
	String EmpName;
	String EmpSurName;
	int EmpNum;
	
	public EmployeeBean() {
		System.out.println("Constructor -> EmployeeBean");
	}
	
	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpSurName() {
		return EmpSurName;
	}

	public void setEmpSurName(String empSurName) {
		EmpSurName = empSurName;
	}

	public int getEmpNum() {
		return EmpNum;
	}

	public void setEmpNum(int empNum) {
		EmpNum = empNum;
	}

	public void afterPropertiesSet() {
		EmpName = "Jigar";
		EmpSurName = "Panchal";
		EmpNum = 123;
		System.out.println("InitializingBean ->afterPropertiesSet()");
	}

	public void destroy() throws Exception {
		System.out.println("DisposableBean -> destroy()");
	}
}

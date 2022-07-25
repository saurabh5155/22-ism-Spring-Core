package com;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.DoctorBean;
import com.bean.EmployeeBean;
import com.bean.PatientBean;
import com.bean.StudentBean;
import com.bean.UserBean;
import com.controller.SignupController;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        System.out.println("ClassPathXmlApplicationContext -->"+context);

		SignupController sc = (SignupController) context.getBean("SignupController");
//        UserBean
		UserBean user = context.getBean("user", UserBean.class);

		System.out.println("FirstName ->" + user.getFirstName());
		System.out.println("-------------------------------------------------------------------");

//        StudentBean
		StudentBean student = (StudentBean) context.getBean("student");
		System.out.println("Student Name ->" + student.getFirstname());
		System.out.println("Student Last Name ->" + student.getLastName());
		System.out.println("----------------------------------------------------------------------");

//        Employee Bean
		EmployeeBean employeeBean = (EmployeeBean) context.getBean("employee");
		System.out.println("Employee Name ->" + employeeBean.getEmpName());
		System.out.println("Employee Surname ->" + employeeBean.getEmpSurName());
		System.out.println("Employee Number ->" + employeeBean.getEmpNum());
		System.out.println("------------------------------------------------------------------------");
		
//		Doctor & Address Constructor DI
		DoctorBean doctorBean =(DoctorBean) context.getBean("doctor");
		System.out.println("Doctor Name ->"+doctorBean.getDocName());
		System.out.println("------------------------------------------------------------------------");

//		Patient & Address2 Setter DI
		PatientBean patientBean =(PatientBean) context.getBean("patient");
		System.out.println("Patient ->"+patientBean.getPtName());
		System.out.println("------------------------------------------------------------------------");

		
		
		context.registerShutdownHook();
	}
}

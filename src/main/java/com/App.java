package com;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.StudentBean;
import com.bean.UserBean;
import com.controller.SignupController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        System.out.println("ClassPathXmlApplicationContext -->"+context);
        
        SignupController sc =(SignupController) context.getBean("SignupController");
        
        UserBean user = context.getBean("user",UserBean.class);
        
        System.out.println("FirstName ->"+user.getFirstName());
        
        StudentBean student =(StudentBean) context.getBean("student");
        System.out.println("Student Name ->"+	student.getFirstname());
        System.out.println("Student Last Name ->"+	student.getLastName());
        
        context.registerShutdownHook();
    }
}

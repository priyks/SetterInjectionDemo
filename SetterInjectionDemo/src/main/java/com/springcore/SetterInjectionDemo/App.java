package com.springcore.SetterInjectionDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This class is used to invoke Student Object from IOC Container by using setter Injection
 * @author priyankaku
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context= new  ClassPathXmlApplicationContext("Config.xml");
         Student student1= (Student) context.getBean("Student1");
         System.out.println(student1);
    }
}

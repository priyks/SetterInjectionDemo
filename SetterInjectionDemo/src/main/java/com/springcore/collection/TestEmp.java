package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/CollectionConfig.xml");
		Employee emp1=(Employee) context.getBean("emp1");
		System.out.println("Name of Employee : "+emp1.getEmpName());
	
		System.out.println("-------List-----");
		System.out.println(emp1.getDevices());
		System.out.println("------Set------");
		System.out.println(emp1.getPhoneNo());
		System.out.println("-----Map-----");
		System.out.println(emp1.getCourse());
		System.out.println("---Properties---"); // It is used to maintain a list of values in which the key is a string and the value is also a string
		System.out.println(emp1.getProps());

	}

}

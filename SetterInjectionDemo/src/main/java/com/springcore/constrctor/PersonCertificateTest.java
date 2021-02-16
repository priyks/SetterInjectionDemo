package com.springcore.constrctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PersonCertificateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constrctor/ConstructorConfig.xml");
		Person p1=(Person) context.getBean("person1");
		System.out.println(p1);
	    Person p2=(Person) context.getBean("person2");
		System.out.println(p2);
	}

}

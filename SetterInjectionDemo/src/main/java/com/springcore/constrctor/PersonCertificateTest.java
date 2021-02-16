package com.springcore.constrctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PersonCertificateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constrctor/ConstructorConfig.xml");
		Person p=(Person) context.getBean("person");
		System.out.println(p);
	}

}

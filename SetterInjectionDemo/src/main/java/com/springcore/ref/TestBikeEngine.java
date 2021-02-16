package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * This TestBikeEngine Class is responsible to get Object of Bike which is depend on Engine class 
 * @author priyankaku
 *
 */
public class TestBikeEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/RefConfig.xml");
		Bike b=(Bike) context.getBean("bike");
		System.out.println(b);

	}

}

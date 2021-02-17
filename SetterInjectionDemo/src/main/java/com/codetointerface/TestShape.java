package com.codetointerface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext context=new ClassPathXmlApplicationContext("com/codetointerface/SpringShape.xml");
    /* Triangle triangle=(Triangle) context.getBean("triangle");
     triangle.draw();*/
  /*   
     Shape shape=(Shape) context.getBean("triangle");
     shape.draw();*/
     
     Shape shape1=(Shape) context.getBean("circleDemo");
     shape1.draw();
     
	}

}

package com.springcore.ref;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
/**
 * BeanPostProcessor are the classes that tell the spring container that before and after initialization 
 * of bean there are some processing the spring needs to do
 * @author priyankaku
 *
 */
public class DisplayNameByBeanPostProcessor  implements BeanPostProcessor{

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	   System.out.println("Post Process Before Initialization  "+beanName);
		return bean;
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("Post Process After Initialization  "+beanName);
		return bean;
	}

}

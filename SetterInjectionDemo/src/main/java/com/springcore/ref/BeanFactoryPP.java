package com.springcore.ref;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
/**
 * This Interface provide method to do some processing when bean factory it self initialized 
 * @author priyankaku
 *
 */
public class BeanFactoryPP  implements BeanFactoryPostProcessor{

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanFactoryPostProcessor#postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory)
	 */
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
		System.out.println("post Process Bean Factory method is called ");
	}

}

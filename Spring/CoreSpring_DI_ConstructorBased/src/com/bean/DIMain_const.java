package com.bean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class DIMain_const {

	public static void main(String[] args) {
		
	
	ApplicationContext context_new = new ClassPathXmlApplicationContext("Beans.xml");
    
	
	Person obj=(Person) context_new.getBean("person");
    System.out.println("Name:"+obj.getName());  
   
    
	}

}

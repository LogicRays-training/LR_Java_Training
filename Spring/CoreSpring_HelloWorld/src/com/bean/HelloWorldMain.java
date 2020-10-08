package com.bean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class HelloWorldMain {

	public static void main(String[] args) {
	/* method-1
	 XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
	 HelloWorld h=(HelloWorld) factory.getBean("hello");
	 System.out.println("\n Msg is:"+h.getMsg());
	 */
	
	/*
    ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    HelloWorld h=(HelloWorld) context.getBean("hello");
	System.out.println("\n Msg is:"+h.getMsg());
	*/
		
	AbstractApplicationContext context_new = new ClassPathXmlApplicationContext("Beans.xml");
    HelloWorld h=(HelloWorld) context_new.getBean("hello");
	System.out.println("\n Msg is:"+h.getMsg());
	context_new.registerShutdownHook();//call to destroy
	
    HelloWorld h1=(HelloWorld) context_new.getBean("hello");
	System.out.println("\n Msg is:"+h1.getMsg());
	context_new.registerShutdownHook();//call to destroy

	}

}

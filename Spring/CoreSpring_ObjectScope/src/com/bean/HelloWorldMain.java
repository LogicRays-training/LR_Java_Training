package com.bean;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldMain {

	public static void main(String[] args) {
	
		
	AbstractApplicationContext context_new = new ClassPathXmlApplicationContext("Beans.xml");
    
    HelloWorld obj1=(HelloWorld) context_new.getBean("hello");//bean1
    obj1.setMsg("LogicRays tech");
    System.out.println(">>>" + obj1.getMsg());
    context_new.registerShutdownHook();
    
    HelloWorld obj2=(HelloWorld) context_new.getBean("hello");//bean2
    obj2.setMsg("ABC tech");
    System.out.println(">>>" + obj2.getMsg());
    context_new.registerShutdownHook();
    
	}

}

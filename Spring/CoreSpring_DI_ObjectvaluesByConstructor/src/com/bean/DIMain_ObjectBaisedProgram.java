package com.bean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIMain_ObjectBaisedProgram {

	public static void main(String[] args) {
		
	
	ApplicationContext context_new = new ClassPathXmlApplicationContext("Beans.xml");
    
	
	Person obj=(Person) context_new.getBean("person");
     System.out.println("Name:"+obj.getName());  
     obj.callPhone();
    
	}

}

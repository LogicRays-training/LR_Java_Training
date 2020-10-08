package com.bean;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {
	
		
	AbstractApplicationContext context_new = new ClassPathXmlApplicationContext("Beans.xml");
    
    CustomerBean c1=(CustomerBean) context_new.getBean("cust_Child");
    c1.setCustId(111);
    c1.setFname("Nivedita");
    c1.setLname("Shivare");
    c1.setFlatno(1001);
    c1.setStreetName("Narayan Park,Bopal");
    c1.setPincode(580038);
    
    System.out.println("\n Customer Info");
    System.out.println(c1);
    
    
	}

}

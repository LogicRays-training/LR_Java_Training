package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Dept;
import com.bean.Emp;

public class EmpUtil {
	public static Session openConnection() {
		Session s=null;
		SessionFactory sf=null;
		 sf=new Configuration()
				 .addAnnotatedClass(Dept.class)
				 .addAnnotatedClass(Emp.class)
				 .configure()
				 .buildSessionFactory();
		 
		 s=sf.openSession();
		return s;
		
	}
}

package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Emp;
import com.bean.EmpInfo;

public class EmployeeUtil {
	 public static Session createConnection()
	 {
		 Session session=null;
		 SessionFactory sf=null;
		 
		 sf=new Configuration()
				 .addAnnotatedClass(EmpInfo.class)
				 .addAnnotatedClass(Emp.class)
				 .configure()
				 .buildSessionFactory();
		 session=sf.openSession();
		return session;
		 
	 }

}

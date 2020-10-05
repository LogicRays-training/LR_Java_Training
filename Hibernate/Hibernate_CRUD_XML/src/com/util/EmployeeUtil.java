package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeUtil {
public static Session openConnection() {
	Session s=null;
	SessionFactory sf=null;
	 sf=new Configuration()
			 .configure()
			 .buildSessionFactory();
	 
	 s=sf.openSession();
	return s;
	
}
}

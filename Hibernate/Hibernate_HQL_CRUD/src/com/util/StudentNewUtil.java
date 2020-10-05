package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentNewUtil {
	public static Session createConnection()
	 {
		 Session session=null;
		 SessionFactory sf=null;
		 
		 sf=new Configuration()
				 .configure()
				 .buildSessionFactory();
		 session=sf.openSession();
		return session;
		 
	 }
}

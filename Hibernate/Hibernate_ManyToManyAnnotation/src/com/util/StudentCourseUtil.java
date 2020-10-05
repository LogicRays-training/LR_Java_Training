package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.*;


public class StudentCourseUtil {

	public static Session createSession()
	{
		SessionFactory sf=new Configuration()
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class)
				.configure()
				.buildSessionFactory();
		Session session=sf.openSession();
		return session;
	}
}

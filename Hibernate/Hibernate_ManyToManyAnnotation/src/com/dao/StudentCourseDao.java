package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Course;
import com.bean.Student;
import com.util.StudentCourseUtil;

public class StudentCourseDao {

	public static void addCourses(Course c) {
		Session session=StudentCourseUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.save(c);
		tr.commit();
		session.close();
		
	}

	public static void addStudent(Student s) {
		Session session=StudentCourseUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.save(s);
		tr.commit();
		session.close();
		
	}

}

package com.controller;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Course;
import com.bean.Student;
import com.dao.StudentCourseDao;


@WebServlet("/StudentCourseController")
public class StudentCourseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("Insert")){
			//add courses
			Course course1 = new Course();
			course1.setCourseName(request.getParameter("cname1"));
			
			Course course2 = new Course();
			course2.setCourseName(request.getParameter("cname2"));
			
			Course course3 = new Course();
			course3.setCourseName(request.getParameter("cname3"));
			
			
			Student s1 = new Student();
			s1.setFname(request.getParameter("fname"));
			s1.setLname(request.getParameter("lname"));
			
			Collection<Course> col = new HashSet<Course>();
			col.add(course1);
			col.add(course2);
			col.add(course3);
			
			s1.setCourses(col);
			
			
			StudentCourseDao.addCourses(course1);
			StudentCourseDao.addCourses(course2);
			StudentCourseDao.addCourses(course3);
			StudentCourseDao.addStudent(s1);			
			
		}
	}

}

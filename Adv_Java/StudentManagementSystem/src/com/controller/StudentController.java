package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.*;
import com.service.*;


@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int sid=Integer.parseInt(request.getParameter("id"));
	StudentService studs=new StudentService();
	
	Student s=studs.findById(sid);//stud from controller will return here
	//System.out.println("\n id="+s.getStudid());

	HttpSession session=request.getSession();//session creation
	session.setAttribute("std", s);//s object is converted into string as std
	
	request.getRequestDispatcher("/EditPages_JSP/EditStudent.jsp").forward(request, response);
	
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action=request.getParameter("action");
	StudentService ss=new StudentService();
	
	if(action.equals("Insert Record"))
	{
		System.out.println("\n Insert Record button is clicked");
		
		Student s=new Student();
		s.setFname(request.getParameter("fname")) ;
		s.setLname(request.getParameter("lname")) ;
		s.setEmail(request.getParameter("email")) ;
		s.setPassword(request.getParameter("password")) ;
		s.setGender(request.getParameter("gender")) ;
		s.setQualif(request.getParameter("qualif")) ;
		s.setLangknown(request.getParameter("langknown1")) ;
		s.setComments(request.getParameter("comments")) ;
	
		ss.save(s);//service layer
		response.sendRedirect("login.jsp");
		
	}
	else if(action.equals("Display Student Records"))
	{
		response.sendRedirect("Display_JSP/DisplayAllStudentRecords.jsp");
	}
	else if(action.equals("Update Record"))
	{
		Student s=new Student();
		s.setStudid(Integer.parseInt(request.getParameter("studid")));//update form new thing
		s.setFname(request.getParameter("fname")) ;
		s.setLname(request.getParameter("lname")) ;
		s.setEmail(request.getParameter("email")) ;
		s.setPassword(request.getParameter("password")) ;
		s.setGender(request.getParameter("gender")) ;
		s.setQualif(request.getParameter("qualif")) ;
		s.setLangknown(request.getParameter("langknown1")) ;
		s.setComments(request.getParameter("comments")) ;
	
		ss.update(s);//service layer
		response.sendRedirect("Display_JSP/DisplayAllStudentRecords.jsp");
		
	}
	else if(action.equals("delete"))
	{
		
		int stdid=Integer.parseInt(request.getParameter("id"));
		
		ss.deleteById(stdid);//service layer
		response.sendRedirect("Display_JSP/DisplayAllStudentRecords.jsp");
		
	}
	else if(action.equalsIgnoreCase("Logout"))
	{
		HttpSession session = request.getSession();
		session.invalidate();
	    response.sendRedirect("login.jsp");
		
	}
	else if(action.equals("login"))
	{
		System.out.println("\n Login button is clicked");
		String email,password;
		email=request.getParameter("email");
		password=request.getParameter("password");
		
		Student s=new Student();
		s.setEmail(email);
		s.setPassword(password);
		
		Student slogin=ss.checkLogin(s);//stud return
		
		if(slogin==null)//record not found in table
		{
			request.setAttribute("errmsg", "Sorry you are not registerd person ");
			request.getRequestDispatcher("login.jsp").include(request,response);	
		}
		else if(email.equals("")||password.equals(""))//check for blank
	    {
			 request.setAttribute("errmsg", " blank email and pass not allow");
			 request.getRequestDispatcher("login.jsp").include(request,response);
		}
		else
		{
			System.out.println("\n User found");
			HttpSession session=request.getSession();
			session.setAttribute("user", slogin);
			request.getRequestDispatcher("profilePage.jsp").forward(request, response);
		}
	}
	}

}

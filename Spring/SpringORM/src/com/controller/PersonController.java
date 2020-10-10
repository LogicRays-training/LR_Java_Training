package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Person;
import com.bo.PersonBO;

@WebServlet("/PersonController")
public class PersonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		PersonBO personBo=(PersonBO) a.getBean("personBo");
		
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert"))
		{
			Person p=new Person();
			p.setPname(request.getParameter("pname"));
			p.setPaddress(request.getParameter("paddress"));
			personBo.insertPerson(p);
			response.sendRedirect("showPerson.jsp");
		}
		else if(action.equalsIgnoreCase("delete")) {
			int pid=Integer.parseInt(request.getParameter("pid"));
			personBo.deletePerson(pid);
			response.sendRedirect("showPerson.jsp");
		}
		else if(action.equalsIgnoreCase("edit")) {
			int pid=Integer.parseInt(request.getParameter("pid"));
			Person p=personBo.getPersonById(pid);
			request.setAttribute("p", p);
			request.getRequestDispatcher("updatePerson2.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update")) {
			Person p=new Person();
			p.setPid(Integer.parseInt(request.getParameter("pid")));
			p.setPname(request.getParameter("pname"));
			p.setPaddress(request.getParameter("paddress"));
			personBo.updatePerson(p);
			response.sendRedirect("showPerson.jsp");
		}
	}

}

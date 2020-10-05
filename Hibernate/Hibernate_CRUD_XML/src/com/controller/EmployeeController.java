package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.EmployeeBean;
import com.dao.EmployeeDao;


@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action=request.getParameter("action");
	if(action.equals("Insert"))
	{
		EmployeeBean e=new EmployeeBean();
		e.setFname(request.getParameter("fname"));
		e.setLname(request.getParameter("lname"));
		e.setEmail(request.getParameter("email"));
		e.setMobile(request.getParameter("mobile"));
		EmployeeDao.insertEmpRecord(e);
		
		System.out.println("\n Record is inserted");
		response.sendRedirect("displayAllRecords.jsp");
	}
	else if(action.equals("Display All Employee Records"))
	{
		response.sendRedirect("displayAllRecords.jsp");
	}
	else if(action.equals("edit"))
	{
		int eid = Integer.parseInt(request.getParameter("empid"));
		EmployeeBean e = EmployeeDao.getEmpById(eid);
		request.setAttribute("emp", e);
		request.getRequestDispatcher("updateEmpRecord.jsp").forward(request, response);
	}
	else if(action.equalsIgnoreCase("Update Record")) 
	{
		EmployeeBean e = new EmployeeBean();
		e.setEmpid(Integer.parseInt(request.getParameter("empid")));
		e.setFname(request.getParameter("fname"));
		e.setLname(request.getParameter("lname"));
		e.setEmail(request.getParameter("email"));
		e.setMobile(request.getParameter("mobile"));
		EmployeeDao.updateEmpRecord(e);
		response.sendRedirect("displayAllRecords.jsp");
	}
	else if(action.equals("delete"))
	{
		int eid = Integer.parseInt(request.getParameter("empid"));
		EmployeeBean e = EmployeeDao.getEmpById(eid);
		EmployeeDao.deleteEmployee(e);
		response.sendRedirect("displayAllRecords.jsp");
	}
	}

}

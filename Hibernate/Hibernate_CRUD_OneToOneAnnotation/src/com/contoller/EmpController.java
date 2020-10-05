package com.contoller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Emp;
import com.bean.EmpInfo;
import com.dao.EmployeeDao;


@WebServlet("/EmpController")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action=request.getParameter("action");
    if(action.equals("Insert"))
    {
    	EmpInfo einfo=new EmpInfo();//Parent object
    	einfo.setFname(request.getParameter("fname"));
    	einfo.setLname(request.getParameter("lname"));
    	EmployeeDao.InsertIntoEmpInfo(einfo);
    	
    	Emp e=new Emp();//child object
    	e.setUname(request.getParameter("uname"));
    	e.setEinfo(einfo);//by means of this parent class attributes will be access in child class
    	EmployeeDao.InsertIntoEmp(e);
    	
    	response.sendRedirect("showEmpRecords.jsp");
    }
    else if(action.equals("Display All Employee Records"))
    {
       	response.sendRedirect("showEmpRecords.jsp");
    }
    else if(action.equals("edit"))
    {
    	int eid=Integer.parseInt(request.getParameter("eid"));
    	Emp e=EmployeeDao.getEmpDataByEid(eid);
    	request.setAttribute("emp", e);
		request.getRequestDispatcher("updateEmpRecord.jsp").forward(request, response);
    }
    else if(action.equals("Update")) 
	{
    	EmpInfo einfo=new EmpInfo();
    	einfo.setEinfo(Integer.parseInt(request.getParameter("einfo")));
    	einfo.setFname(request.getParameter("fname"));
    	einfo.setLname(request.getParameter("lname"));
    	EmployeeDao.updateIntoEmpInfo(einfo);//update parent table
    	
		Emp e = new Emp();
		e.setEid(Integer.parseInt(request.getParameter("eid")));
		e.setUname(request.getParameter("uname"));
		e.setEinfo(einfo);
		EmployeeDao.updateIntoEmp(e);//update child table
		
		response.sendRedirect("showEmpRecords.jsp");
	}
    else if(action.equals("delete"))
    {
		int eid=Integer.parseInt(request.getParameter("eid"));
		Emp e=EmployeeDao.getEmpDataByEid(eid);//update child table
		EmployeeDao.deleteEmp(e);

  		response.sendRedirect("showEmpRecords.jsp");
    }
	}

}

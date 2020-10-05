package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Dept;
import com.dao.DeptDao;


@WebServlet("/DepartmentController")
public class DepartmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert dept"))
		{
			Dept d=new Dept();
			d.setDname(request.getParameter("dname"));
			DeptDao.insertDept(d);
			response.sendRedirect("showAllDepartments.jsp");
		}
		else if(action.equals("Display All Departments"))
		{
			response.sendRedirect("showAllDepartments.jsp");
		}
		else if(action.equals("edit"))
		{
			int deptno=Integer.parseInt(request.getParameter("deptno"));
	    	Dept d=DeptDao.getDeptByDeptno(deptno);
	    	request.setAttribute("dinfo", d);
			request.getRequestDispatcher("updateDepartmentRecord.jsp").forward(request, response);
		}
		else if(action.equals("Update Dept"))
		{
			Dept d=new Dept();
			d.setDeptno(Integer.parseInt(request.getParameter("deptno")));
			d.setDname(request.getParameter("dname"));
			DeptDao.updateDept(d);
			response.sendRedirect("showAllDepartments.jsp");
		}
	}

}

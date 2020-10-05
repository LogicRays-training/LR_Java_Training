package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Emp;
import com.bean.EmpInfo;
import com.util.EmployeeUtil;

public class EmployeeDao {

	public static void InsertIntoEmpInfo(EmpInfo einfo) {
		Session session=EmployeeUtil.createConnection();
		Transaction tr=session.beginTransaction();
		session.save(einfo);//this will store data into EmpInfo parent table
		tr.commit();
		session.close();
	}

	public static void InsertIntoEmp(Emp e) {
		Session session=EmployeeUtil.createConnection();
		Transaction tr=session.beginTransaction();
		session.save(e);//this will store data into Emp child Table
		tr.commit();
		session.close();
		
	}
	
	public static List<Emp> getAllEmpRecords() {
		List<Emp> li=null;

		Session session=EmployeeUtil.createConnection();
		li=session.createQuery("from Emp").list();
		session.close();	
	    return li;
		
	}

	public static Emp getEmpDataByEid(int eid) {
		Emp e = null;
		Session session = EmployeeUtil.createConnection();
		e = session.get(Emp.class, eid);
		return e;
	}

	public static void updateIntoEmpInfo(EmpInfo einfo) {
		Session session=EmployeeUtil.createConnection();
		Transaction tr=session.beginTransaction();
		session.update(einfo);
		tr.commit();
		session.close();
		
	}

	public static void updateIntoEmp(Emp e) {
		Session session=EmployeeUtil.createConnection();
		Transaction tr=session.beginTransaction();
		session.update(e);
		tr.commit();
		session.close();	
	}

	public static void deleteEmp(Emp e) {
		Session session=EmployeeUtil.createConnection();
		Transaction tr=session.beginTransaction();
		session.delete(e);
		tr.commit();
		session.close();
		
	}
}

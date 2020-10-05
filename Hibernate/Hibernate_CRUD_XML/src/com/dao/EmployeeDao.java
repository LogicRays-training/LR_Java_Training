package com.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.EmployeeBean;
import com.util.EmployeeUtil;

public class EmployeeDao {

	public static void insertEmpRecord(EmployeeBean e) 
	{
		Session session=EmployeeUtil.openConnection();
		Transaction tr=session.beginTransaction();
		session.save(e);
		tr.commit();
		session.close();	
	}
	
	public static List<EmployeeBean> displayAllRecords()
	{
		    List<EmployeeBean> li=null;

			Session session=EmployeeUtil.openConnection();
			li=session.createQuery("from EmployeeBean").list();
			session.close();	
		    return li;
	}
	

	public static EmployeeBean getEmpById(int eid) {
		EmployeeBean e = null;
		Session session = EmployeeUtil.openConnection();
		e = session.get(EmployeeBean.class, eid);
		return e;
	}

	public static void updateEmpRecord(EmployeeBean e)
	{
		Session session=EmployeeUtil.openConnection();
		Transaction tr=session.beginTransaction();
		session.update(e);
		tr.commit();
		session.close();	
	}

	public static void deleteEmployee(EmployeeBean e) {
		Session session=EmployeeUtil.openConnection();
		Transaction tr=session.beginTransaction();
		session.delete(e);
		tr.commit();
		session.close();
	}



}

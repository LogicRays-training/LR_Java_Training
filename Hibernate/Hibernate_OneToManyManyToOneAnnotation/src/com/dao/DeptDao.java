package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Dept;
import com.util.EmpUtil;

public class DeptDao {

	public static void insertDept(Dept d) {
		Session session=EmpUtil.openConnection();
		Transaction tr=session.beginTransaction();
		session.save(d);
		tr.commit();
		session.close();
		
	}
	public static List<Dept> getAllDept()
	{
		Session session=EmpUtil.openConnection();
		List<Dept> list=session.createQuery("from Dept").list();
		return list;
	}
	public static Dept getDeptByDeptno(int deptno) {
		Dept d = null;
		Session session = EmpUtil.openConnection();
		d = session.get(Dept.class, deptno);
		return d;
	}
	public static void updateDept(Dept d) {
		Session session=EmpUtil.openConnection();
		Transaction tr=session.beginTransaction();
		session.update(d);
		tr.commit();
		session.close();	
		
	}

}

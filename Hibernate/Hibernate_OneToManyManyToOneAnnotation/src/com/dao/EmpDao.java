package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Emp;
import com.util.EmpUtil;

public class EmpDao {

	public static void insertEmp(Emp e) {
		Session session=EmpUtil.openConnection();
		Transaction tr=session.beginTransaction();
		session.save(e);
		tr.commit();
		session.close();
		
	}

}

package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Util.StudentUtil;
import com.bean.StudentBean;

public class StudentDao {

	public static int doinsert(StudentBean s) {
		
		System.out.println();
		int result=0;
		try {
			StudentUtil sutil = new StudentUtil();
			Connection conn = sutil.createConnection();
			String sql = "insert into student1(fname,lname,email)values(?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1,s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}

package com.dao;

import java.sql.Connection;
import java.util.ArrayList;

import com.bean.Student;
import com.util.DButil;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class StudentDao implements DAOInterface<Student>{
	private static String table="stud_register";
    Connection con;
	
	//Insert data into table
	@Override
	public void save(Student obj) {
		try 
		{
		    con=DButil.getConnection();
		
		    //write a insert query
		    String qur="insert into "+table+" (fname,lname,email,password,gender,qualif,langknown,comments)values(?,?,?,?,?,?,?,?)";
		
	     	PreparedStatement ps = con.prepareStatement(qur);
	     	
	     	ps.setString(1,obj.getFname());
	     	ps.setString(2,obj.getLname());
	     	ps.setString(3,obj.getEmail());
	     	ps.setString(4,obj.getPassword());
	     	ps.setString(5,obj.getGender());
	     	ps.setString(6,obj.getQualif());
	     	ps.setString(7,obj.getLangknown());
	     	ps.setString(8,obj.getComments());
	     	
	     	ps.executeUpdate();
	     	
	     	System.out.println("\n Record is inserted");
	     	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
	}
	
	
	@Override
	public ArrayList<Student> findAll() {
		ArrayList<Student> alist=new ArrayList<>();
		Student stud=null;
		try 
		{
		    con=DButil.getConnection();
		
		    //write a insert query
		   String qur="select *from "+table;
		   
		   PreparedStatement ps = con.prepareStatement(qur);
		   ResultSet rs=ps.executeQuery();
		   
		   while(rs.next())
		   {
			   stud=new Student();
			   stud.setStudid(rs.getInt(1));
			   stud.setFname(rs.getString(2));
			   stud.setLname(rs.getString(3));
			   stud.setEmail(rs.getString(4));
			   stud.setPassword(rs.getString(5));
			   stud.setGender(rs.getString(6));
			   stud.setQualif(rs.getString(7));
			   stud.setLangknown(rs.getString(8));
			   stud.setComments(rs.getString(9));
				
			   alist.add(stud);
		   }
	     	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
		return alist;
	}

	@Override
	public ArrayList<Student> findAllByFirstName(String fname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findById(int id) {
		Student stud=null;
		try 
		{
		    con=DButil.getConnection();
		
		    //write a query
		   String qur="select *from "+table+" where studid=?";
		   
		   PreparedStatement ps = con.prepareStatement(qur);
		   ps.setInt(1,id);
		   ResultSet rs=ps.executeQuery();
		   
		   while(rs.next())
		   {
			   stud=new Student();
			   stud.setStudid(rs.getInt(1));
			   stud.setFname(rs.getString(2));
			   stud.setLname(rs.getString(3));
			   stud.setEmail(rs.getString(4));
			   stud.setPassword(rs.getString(5));
			   stud.setGender(rs.getString(6));
			   stud.setQualif(rs.getString(7));
			   stud.setLangknown(rs.getString(8));
			   stud.setComments(rs.getString(9));
		   }
	     	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
		return stud;
	}

	@Override
	public void update(Student obj) {
		try 
		{
		    con=DButil.getConnection();
		
		    //write a insert query
		    String qur="update "+table+" set fname=?,lname=?,email=?,password=?,gender=?,qualif=?,langknown=?,comments=? where studid=?";
		
	     	PreparedStatement ps = con.prepareStatement(qur);
	     	
	     	ps.setString(1,obj.getFname());
	     	ps.setString(2,obj.getLname());
	     	ps.setString(3,obj.getEmail());
	     	ps.setString(4,obj.getPassword());
	     	ps.setString(5,obj.getGender());
	     	ps.setString(6,obj.getQualif());
	     	ps.setString(7,obj.getLangknown());
	     	ps.setString(8,obj.getComments());
	     	ps.setInt(9, obj.getStudid());
	     	
	     	ps.executeUpdate();
	     	
	     	System.out.println("\n Record is Updated");
	     	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}			
		
	}

	@Override
	public void deleteById(int id) {
		try 
		{
		    con=DButil.getConnection();
		
		    //write a insert query
		    String qur="delete from "+table+" where studid=?";
		
	     	PreparedStatement ps = con.prepareStatement(qur);
	     	ps.setInt(1, id);
	     	
	     	ps.executeUpdate();
	     	
	     	System.out.println("\n Record is deleted");
	     	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}			
		
	}


	@Override
	public Student checkLogin(Student s) {
		Student stud=null;
		try 
		{
		    con=DButil.getConnection();
		     
		    //write a  query
		    String qur="select *from "+table+" where email=? and password=?";
		
	     	PreparedStatement ps = con.prepareStatement(qur);
	     	ps.setString(1, s.getEmail());
	     	ps.setString(2, s.getPassword());
	     	
	     	ResultSet rs=ps.executeQuery();
	     	if(rs.next())
	     	{
	     		   stud=new Student();
	     		   stud.setStudid(rs.getInt(1));
				   stud.setFname(rs.getString(2));
				   stud.setLname(rs.getString(3));
				   stud.setEmail(rs.getString(4));
				   stud.setPassword(rs.getString(5));
				   stud.setGender(rs.getString(6));
				   stud.setQualif(rs.getString(7));
				   stud.setLangknown(rs.getString(8));
				   stud.setComments(rs.getString(9));
	     		
	     	}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}			
		return stud;
	}

}

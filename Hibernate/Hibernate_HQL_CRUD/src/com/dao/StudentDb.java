package com.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.model.StudentNew;
import com.util.StudentNewUtil;

public class StudentDb 
{
	
	private static SessionFactory factory; 
	   
	   
	   /* Method to INSERT student in the database */
	   public static Integer addStudent(String stuname,String sturoll,String stuage,String stuschool)
	   {
		   factory=(SessionFactory) StudentNewUtil.createConnection();
	       Session session = factory.openSession();
	      Transaction tx = null;
	      Integer employeeID = null;
	      try{
	         tx = session.beginTransaction();
	         StudentNew stu = new StudentNew(stuname,sturoll,stuage,stuschool);
	         employeeID = (Integer) session.save(stu); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	         factory.close();
	      }
	      return employeeID;
	   }
	  //  Method to  READ all the students 
	   public static List listStudents(String query1){
		   factory=(SessionFactory) StudentNewUtil.createConnection();
	      Session session = factory.openSession();
	      List list=null;
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();

	         Query query=session.createQuery("from StudentNew "+query1);
	          list=query.list(); 
	         tx.commit();
	        
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	         factory.close();
	      }
		return list;
	   }
	   // Method to UPDATE salary for an employee 
	  public static int updateStudent(String query ){
		  factory=(SessionFactory) StudentNewUtil.createConnection();
	      int status=0;
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         Query q=session.createQuery("update StudentNew "+query);  
	         
	           
	          status=q.executeUpdate();  
	         System.out.println(status);  
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return status;
	   }
	    //Method to DELETE an employee from the records 
	   public static void deleteStudent(String query){
		   factory=(SessionFactory) StudentNewUtil.createConnection();
	      Session session = factory.openSession();
	      int i=0; 
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();

	         Query query1=session.createQuery("delete from StudentNew "+query);  
	       
	       i=query1.executeUpdate();  
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	   }
	



	   
	   
}

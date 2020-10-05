package com.model;

import java.util.Iterator;
import java.util.List;

import com.dao.StudentDb;
import com.model.StudentNew;

public class StudentWork {

	public static void main(String[] args) {
	
		
		///////////////INSERT student data
		Integer i=StudentDb.addStudent("Nivedita", "11", "26", "ABCD");
		
		/*
		///////////FETCH all students data
		List lst=StudentDb.listStudents("");
		
		//////////FETCH student data with condition
		
		List lst1=StudentDb.listStudents(" where stuname='nivedita'");
		Iterator it=lst1.iterator();
		while(it.hasNext())
		{
			StudentNew stud=(StudentNew)it.next();
			System.out.println("-------------------");
			System.out.println("Name :"+stud.stuname);
			System.out.println("Roll :"+stud.sturoll);
			System.out.println("Age :"+stud.stuage);
			System.out.println("School :"+stud.stuschool);
			System.out.println("-------------------");
		}
		
		/////////////UPDATE student data with condition
		
		int i1=StudentDb.updateStudent(" set stuname='Margi',stuage='31' where stuid='1'");
		if(i1>0)
		{
			System.out.println("Update successfully");
		}
		else
		{
			System.out.println("something went wrong");
		}
		
		///////////////DELETE student data with condition
		StudentDb.deleteStudent(" where stuid='1'");
		*/
	}
	

}

package com.service;
import java.util.ArrayList;

import com.bean.Student;
import com.dao.StudentDao;
public class StudentService implements ServiceInterface<Student>{
	private static StudentDao dao;

	public StudentService() {
		dao = new StudentDao();
	}
	
	@Override
	public void save(Student s) {
		dao.save(s);//dao methods
	}
	@Override
	public ArrayList<Student> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public ArrayList<Student> findAllByFirstName(String fname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void update(Student obj) {
		dao.update(obj);
		
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public Student checkLogin(Student s) {
		
		return dao.checkLogin(s);
	}



}

package com.service;

import java.util.ArrayList;

public interface ServiceInterface<T> {
	
	public ArrayList<T> findAll();
	
	public ArrayList<T> findAllByFirstName(String fname);

	public T findById(int id);
	
	public void update(T obj);
	
	public void save(T obj);
	
	public void deleteById(int id);
	
	public T checkLogin(T obj);
}


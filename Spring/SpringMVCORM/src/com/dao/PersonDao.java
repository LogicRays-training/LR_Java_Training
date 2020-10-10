package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.spring.Person;

public class PersonDao extends HibernateDaoSupport{
	
	public void insertPerson(Person p)
	{
		getHibernateTemplate().save(p);
	}
	public void updatePerson(Person p)
	{
		getHibernateTemplate().update(p);
	}
	public void deletePerson(int id)
	{
		HibernateTemplate template=getHibernateTemplate();
		Person p=template.get(Person.class,id);
		getHibernateTemplate().delete(p);
	}
	public Person getPersonById(int id)
	{
		HibernateTemplate template=getHibernateTemplate();
		Person p=template.get(Person.class,id);
		return p;
	}
	public List<Person> getAllPerson()
	{
		List<Person> list=getHibernateTemplate().find("from Person");
		return list;
	}
}

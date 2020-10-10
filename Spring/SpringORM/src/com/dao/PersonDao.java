package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.Person;

public class PersonDao extends HibernateDaoSupport {

	public void insertPerson(Person p) {
		getHibernateTemplate().save(p);
	}
	public void updatePerson(Person p) {
		getHibernateTemplate().update(p);
	}
	public Person getPersonById(int pid) {
		HibernateTemplate template = getHibernateTemplate();
		Person p = template.get(Person.class, pid);
		return p;
	}
	public List<Person> getAllPerson() {
		List<Person> list = getHibernateTemplate().find("from Person");
		return list;
	}
	public void deletePerson(int pid) {
		HibernateTemplate template = getHibernateTemplate();
		Person p = template.get(Person.class, pid);
		template.delete(p);
	}
}

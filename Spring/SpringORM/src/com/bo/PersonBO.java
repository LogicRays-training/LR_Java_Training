package com.bo;

import java.util.List;

import com.bean.Person;
import com.dao.PersonDao;

public class PersonBO {

	PersonDao personDao;

	public PersonDao getPersonDao() {
		return personDao;
	}
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	public void insertPerson(Person p)
	{
		personDao.insertPerson(p);
	}
	public void updatePerson(Person p)
	{
		personDao.updatePerson(p);
	}
	public void deletePerson(int pid)
	{
		personDao.deletePerson(pid);
	}
	public Person getPersonById(int pid)
	{
		return personDao.getPersonById(pid);
	}
	public List<Person> getAllPerson()
	{
		return personDao.getAllPerson();
	}

}

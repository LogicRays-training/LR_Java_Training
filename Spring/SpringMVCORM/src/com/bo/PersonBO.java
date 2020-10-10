package com.bo;

import java.util.List;

import com.dao.PersonDao;
import com.spring.Person;

public class PersonBO {

	private PersonDao personDao;

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
	public void deletePerson(int id)
	{
		personDao.deletePerson(id);
	}
	public Person getPersonById(int id)
	{
		return personDao.getPersonById(id);
	}
	public List<Person> getAllPerson()
	{
		return personDao.getAllPerson();
	}
}

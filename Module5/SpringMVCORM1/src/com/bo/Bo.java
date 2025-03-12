package com.bo;

import java.util.List;

import com.dao.Dao;
import com.model.Person;

public class Bo 
{
	Dao dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	
	public void insertdata(Person p)
	{
		dao.insertdata(p);
	}
	public void updatedata(Person p)
	{
		dao.updatedata(p);
	}
	public void deletedata(Person p)
	{
		dao.deletedata(p);
	}

	public List<Person> getall()
	{
		return dao.getall();
	}
	
	public Person getSingle(Person p)
	{
		return dao.getSingle(p);
	}
	
}

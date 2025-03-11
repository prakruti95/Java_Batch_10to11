package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Person;

public class Dao extends HibernateDaoSupport
{
	
	public void insertdata(Person p)
	{
		this.getHibernateTemplate().save(p);
	}
	public void updatedata(Person p)
	{
		this.getHibernateTemplate().update(p);
	}
	public void deletedata(Person p)
	{
		this.getHibernateTemplate().delete(p);
	}

	public List<Person> getall()
	{
		List<Person> getlist = this.getHibernateTemplate().find("from Person");
		return getlist;
	}
	
	public Person getSingle(Person p)
	{
		Person p1 = this.getHibernateTemplate().get(Person.class, p.getId());
		return p1;
	}
	
	
}

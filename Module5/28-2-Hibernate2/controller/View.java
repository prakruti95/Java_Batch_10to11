package com.controller;

import java.util.List;
import com.dao.MyDao;
import com.model.Person;

public class View 
{
	public static void main(String[] args) 
	{
		List<Person>list = new MyDao().viewdata();
		
		for(Person person : list)
		{
			System.out.println(person.getId()+"\t|\t"+person.getName()+"\t|\t"+person.getSurname());
		}
	
	}
}

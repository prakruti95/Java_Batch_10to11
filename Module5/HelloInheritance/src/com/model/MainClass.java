package com.model;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) 
	{
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		Model m = (Model) acm.getBean("t2");
		
		System.out.println(m.getName());
		System.out.println(m.getSurname());
	}
}

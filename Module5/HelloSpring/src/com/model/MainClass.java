package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args)
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		Model m = (Model) acm.getBean("t1");
		System.out.println("Hello "+m.getId()+" "+m.getName());
	}
}

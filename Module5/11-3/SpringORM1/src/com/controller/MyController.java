package com.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.bo.Bo;
import com.model.Person;

public class MyController 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
//		
		//System.out.println("Enter Your Name");
		Person p1 = new Person();
		p1.setId(sc.nextInt());
		//p1.setName(sc.next());
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		
		Bo bo = (Bo) acm.getBean("bo");
		//bo.deletedata(p1);
		//bo.insertdata(p1);
		
		
		//System.out.println("Deleted");
		
//		List<Person> getall = bo.getall();
//		
//		System.out.println("ID\t|\tName");
//		
//		for (Person person : getall) 
//		{
//			System.out.println(person.getId()+"\t|\t"+person.getName());
//		}
//		
		Person p = bo.getSingle(p1);
		System.out.println(p.getId()+" "+p.getName());
		
		
	}
}

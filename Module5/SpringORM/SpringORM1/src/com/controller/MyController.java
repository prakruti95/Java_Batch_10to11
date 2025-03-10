package com.controller;

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
		
		System.out.println("Enter Your Name");
		Person p1 = new Person();
		p1.setId(sc.nextInt());
		p1.setName(sc.next());
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		
		Bo bo = (Bo) acm.getBean("bo");
		bo.updatedata(p1);
		//bo.insertdata(p1);
		
		System.out.println("Updated");
		
	}
}

package com.controller;

import java.util.Scanner;

import com.dao.MyDao;
import com.model.Person;

public class Select 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int id = sc.nextInt();
		
		Person p = new Person();
		p.setId(id);
		
		Person p2 = new MyDao().selectdata(p);
		
		System.out.println(p2.getId());
		System.out.println(p2.getName());
		System.out.println(p2.getSurname());
		
	}
}

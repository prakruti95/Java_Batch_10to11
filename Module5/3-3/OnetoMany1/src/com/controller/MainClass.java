package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Address;
import com.model.Person;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		Person p = new Person();
		Address a = new Address();
		Address a2 = new Address();
		
		System.out.println("Enter Name");
		String name = sc.next();
		
		System.out.println("Enter Address 1:");
		String address = sc.next();
		
		System.out.println("Enter Address 2:");
		String address2 = sc.next();
		
		p.setName(name);
		a.setAddress(address);
		a2.setAddress(address2);
		a.setPerson(p);
		a2.setPerson(p);
		
	
		
		sess.save(p);
		sess.save(a);
		sess.save(a2);	
		tr.commit();
		sess.close();
		
	
				
		
		
		
		
		
		
		
		
		
	}
}

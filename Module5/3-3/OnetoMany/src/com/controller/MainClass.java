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
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		
		System.out.println("Enter Your Address");
		String address = sc.next();
		
		System.out.println("Enter Your Address2");
		String address2 = sc.next();
		
		
		Person person = new Person();
		
		person.setName(name);
		
		
		
		
		
		
		Address address3 = new Address();
		Address address4 = new Address();
		
		address3.setAddress(address);
		address4.setAddress(address2);
		
		List<Address>list = new ArrayList<>();
		list.add(address3);
		list.add(address4);
		
		
		
		//address3.setAddress(address);
		//address3.setAddress(address2);
		
		
		person.setListaddress(list);
		
		
		
		
		
		sess.save(person);
		//sess.save(list);
		//sess.save(person2);
		sess.save(address3);
		sess.save(address4);
		tr.commit();
		sess.close();
		
		
		
		
		
	}
}

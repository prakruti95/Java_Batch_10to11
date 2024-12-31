package com.a3112;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 
{
	public static void main(String[] args) 
	{
		
		LinkedList<String>list = new LinkedList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.addFirst("e");
		list.addLast("r");
		
		System.out.println(list.size());
		
		Iterator<String>i = list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}

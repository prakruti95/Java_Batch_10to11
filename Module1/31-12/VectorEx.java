package com.a3112;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) 
	{
		
		Vector<String> v = new Vector<>(5);//initialcapacity
	
		v.add("android");
		v.add("android");
		v.add("android");
		v.add("android");
		v.add("android");
		v.add("android");
		v.add("android");
		v.add("android");
		v.add("android");
		v.add("android");
		v.add("android2");
		
		
		System.out.println("Capacity: "+v.capacity());
		System.out.println("Size: "+v.size());
		
		if(v.contains("android"))
		{
			System.out.println("Accepted");
		}
		else
		{
			System.out.println("Not Found");
		}
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		
		Iterator<String>i = v.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}
}
